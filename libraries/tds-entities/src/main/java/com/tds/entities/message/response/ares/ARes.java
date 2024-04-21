package com.tds.entities.message.response.ares;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.AcsRenderingType;
import com.tds.entities.component.MessageExtension;
import com.tds.entities.constants.MessageType;
import com.tds.entities.message.response.TdsResponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class ARes implements TdsResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1354739577152275973L;
	
	private String messageVersion;
	private String messageType;
	private String threeDSServerTransID;
	private String acsTransID;
	private String dsTransID;
	private String sdkTransID;
	private List<MessageExtension> messageExtension;
	
	private String dsReferenceNumber;
	private String acsChallengeMandated;
	private String acsOperatorID;
	private String eci;
	private String transStatus;
	private String authenticationValue;
	private String acsURL;
	private String acsReferenceNumber;
	private AcsRenderingType acsRenderingType;
	private String transStatusReason;
	private String acsSignedContent;
	
	public ARes() {
		setMessageType(MessageType.ARes);
	}
}
