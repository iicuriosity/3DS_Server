package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class ErrorMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8769942755808074690L;
	private String acsTransID;
	private String dsTransID;
	private String messageVersion;
	private String errorComponent;
	private String errorDescription;
	private String messageType;
	private String threeDSServerTransID;
	private String sdkTransID;
	private String errorCode;
	private String errorDetail;
	private String errorMessageType;

}
