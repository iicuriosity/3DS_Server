package com.tds.entities.message.request.rreq;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class RReq2_1 extends RReq{/**
	 * 
	 */
	private static final long serialVersionUID = 4940141005499597644L;

	private String authenticationMethod;
	private String authenticationType;
}
