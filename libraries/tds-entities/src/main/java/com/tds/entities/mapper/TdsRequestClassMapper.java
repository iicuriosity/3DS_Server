package com.tds.entities.mapper;

public interface TdsRequestClassMapper {

	Class<?> getRequestClass(String messageType, String messageVersion);
}
