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
public class SdkEphemPubKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3868439858490666483L;
	
	private String kty;
	private String crv;
	private String x;
	private String y;

}
