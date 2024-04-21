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
public class ThreeDSRequestorPriorAuthenticationInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2437319516537107233L;
	
	private String threeDSReqPriorAuthData;
	private String threeDSReqPriorAuthMethod;
	private String threeDSReqPriorAuthTimestamp;
	private String threeDSReqPriorRef;

}
