package com.tds.kafka.exception;

import com.tds.core.exception.TdsException;

import lombok.Getter;

@Getter
public class KafkaTdsException extends TdsException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2019647065502377887L;
	private final String correlationID;

	public KafkaTdsException(String correlationID) {
		super();
		this.correlationID = correlationID;
	}

	public KafkaTdsException(String correlationID, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.correlationID = correlationID;
	}

	public KafkaTdsException(String correlationID,String message, Throwable cause) {
		super(message, cause);
		this.correlationID = correlationID;
	}

	public KafkaTdsException(String correlationID,String message) {
		super(message);
		this.correlationID = correlationID;
	}

	public KafkaTdsException(String correlationID,Throwable cause) {
		super(cause);
		this.correlationID = correlationID;
	}

}
