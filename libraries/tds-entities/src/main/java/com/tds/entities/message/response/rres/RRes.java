package com.tds.entities.message.response.rres;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.MessageExtension;
import com.tds.entities.message.response.TdsResponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class RRes implements TdsResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5513182296260675151L;
	
	private String messageVersion;
	private String messageType;
	private String threeDSServerTransID;
	private String acsTransID;
	private String dsTransID;
	private String sdkTransID;
	private List<MessageExtension> messageExtension;
	
	private String resultsStatus;

}
