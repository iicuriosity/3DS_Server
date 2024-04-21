package com.tds.kafka.aspect.advice;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;

import com.tds.kafka.annotation.advice.KafkaControllerAdvice;
import com.tds.kafka.annotation.advice.KafkaExceptionHandler;

@Aspect
//@Component
public class KafkaExceptionHandlingAspect {
	private final Map<Class<? extends Throwable>, List<HandlerMethod>> handlers = new HashMap<>();
	private final ApplicationContext context;

	public KafkaExceptionHandlingAspect(ApplicationContext context) {
		this.context = context;
		init();
	}

	private void init() {
		Map<String, Object> beans = context.getBeansWithAnnotation(KafkaControllerAdvice.class);
		for (Map.Entry<String, Object> entry : beans.entrySet()) {
			Class<?> beanClass = entry.getValue().getClass();
			KafkaControllerAdvice advice = beanClass.getAnnotation(KafkaControllerAdvice.class);
			for (Method method : beanClass.getDeclaredMethods()) {
				if (method.isAnnotationPresent(KafkaExceptionHandler.class)) {
					KafkaExceptionHandler handlerAnnotation = method.getAnnotation(KafkaExceptionHandler.class);
					for (Class<? extends Throwable> excClass : handlerAnnotation.value()) {
						if (!handlers.containsKey(excClass)) {
							handlers.put(excClass, new ArrayList<>());
						}
						handlers.get(excClass).add(new HandlerMethod(entry.getValue(), method, advice.basePackages()));
					}
				}
			}
		}
	}

	@Around("@annotation(org.springframework.kafka.annotation.KafkaListener)")
	public Object handleKafkaExceptions(ProceedingJoinPoint pjp) throws Throwable {
		try {
			return pjp.proceed();
		} catch (Throwable ex) {
			HandlerMethod handlerMethod = findHandler(ex, pjp.getTarget().getClass());
			if (handlerMethod != null) {
				return handlerMethod.invoke(ex);
			}
			throw ex;
		}
	}

	private HandlerMethod findHandler(Throwable ex, Class<?> beanClass) {
		Class<?> clazz = ex.getClass();
		List<Class<?>> classes = new ArrayList<>();

		while (clazz != Throwable.class) {
			classes.add(clazz);
			Collections.addAll(classes, clazz.getInterfaces());
			clazz = clazz.getSuperclass();
		}

		classes.sort((c1, c2) -> {
			if (c1.isAssignableFrom(c2)) {
				return 1;
			} else if (c2.isAssignableFrom(c1)) {
				return -1;
			}
			return 0;
		});

		for (Class<?> cls : classes) {
			List<HandlerMethod> list = handlers.get(cls);
			if (list != null) {
				for (HandlerMethod handler : list) {
					if (handler.appliesTo(beanClass.getPackage().getName())) {
						return handler;
					}
				}
			}
		}

		return null;
	}

	static class HandlerMethod {
		private final Object bean;
		private final Method method;
		private final String[] basePackages;

		HandlerMethod(Object bean, Method method, String[] basePackages) {
			this.bean = bean;
			this.method = method;
			this.basePackages = basePackages;
		}

		boolean appliesTo(String packageName) {
			if (basePackages.length == 0)
				return true; // Default, applies globally
			for (String basePackage : basePackages) {
				if (packageName.startsWith(basePackage)) {
					return true;
				}
			}
			return false;
		}

		Object invoke(Throwable ex) throws Throwable {
			return method.invoke(bean, ex);
		}
	}

}
