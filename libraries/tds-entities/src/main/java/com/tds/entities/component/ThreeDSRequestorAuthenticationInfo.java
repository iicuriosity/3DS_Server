package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class ThreeDSRequestorAuthenticationInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3571973436537498324L;
	
	private Object threeDSReqAuthData;
	private String threeDSReqAuthMethod;
	private String threeDSReqAuthTimestamp;
	private String dsAuthInfVerifInd;
}
