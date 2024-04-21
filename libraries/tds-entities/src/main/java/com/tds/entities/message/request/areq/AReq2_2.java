package com.tds.entities.message.request.areq;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class AReq2_2 extends AReq2_1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -23430333120711835L;

	private String whiteListStatus;
	private String threeDSReqAuthMethodInd;
	private String threeDSRequestorDecMaxTime;
	private Boolean browserJavascriptEnabled;
	private String whiteListStatusSource;
	private String threeDSRequestorDecReqInd;
	private String payTokenSource;
}
