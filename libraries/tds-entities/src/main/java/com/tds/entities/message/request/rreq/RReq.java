package com.tds.entities.message.request.rreq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.AcsRenderingType;
import com.tds.entities.component.MessageExtension;
import com.tds.entities.constants.MessageType;
import com.tds.entities.message.request.TdsRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public abstract class RReq implements TdsRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1259071709092576160L;
	private String messageVersion;
	private String messageType;
	private String threeDSServerTransID;
	private String acsTransID;
	private String dsTransID;
	private String sdkTransID;
	private List<MessageExtension> messageExtension;
	
	private String messageCategory;
	private String challengeCancel;
	private String transStatus;
	private AcsRenderingType acsRenderingType;
	private String interactionCounter;
	private String authenticationValue;
	private String dsReferenceNumber;
	private String transStatusReason;
	private String eci;
	
	public RReq() {
		setMessageType(MessageType.RReq);
	}
}
