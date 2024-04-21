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
public class WebAuthnCred implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -396275929460467724L;
	
	private String rpID;
	private String credentialIds;
}
