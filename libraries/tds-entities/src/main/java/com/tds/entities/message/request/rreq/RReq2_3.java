package com.tds.entities.message.request.rreq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.CardHolderInfo;
import com.tds.entities.component.ErrorMessage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class RReq2_3 extends RReq{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1777247256481118546L;
	
	private List<String> authenticationMethod;
	private ErrorMessage challengeErrorReporting;
	private String deviceBindingStatus;
	private String deviceBindingStatusSource;
	private String trustListStatus;
	private CardHolderInfo cardholderInfo;
	private String trustListStatusSource;
	private String transStatusReasonInfo;
}
