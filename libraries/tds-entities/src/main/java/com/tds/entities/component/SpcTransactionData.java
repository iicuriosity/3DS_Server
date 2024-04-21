package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.JSONObject;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class SpcTransactionData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4550753688501986552L;
	
	private PSImage psImageSpc;
	private String challengeInfoText;
	private JSONObject additionalData;
	private String value;
	private String currency;
	private String extInd;
	private String timeout;
	private PSImage issuerImageSpc;
	private String payeeName;
	private String displayName;
	private String challenge;
	private String icon;
	private String payeeOrigin;
}
