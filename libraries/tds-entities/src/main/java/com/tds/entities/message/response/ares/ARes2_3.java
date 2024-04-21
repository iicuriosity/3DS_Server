package com.tds.entities.message.response.ares;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.BroadInfo;
import com.tds.entities.component.CardHolderInfo;
import com.tds.entities.component.SpcTransactionData;
import com.tds.entities.component.WebAuthnCred;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class ARes2_3 extends ARes{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4783284478230370241L;

	  private SpcTransactionData spcTransData;
	  private String trustListStatusSource;
	  private String deviceBindingStatusSource;
	  private BroadInfo broadInfo;
	  private List<String> authenticationMethod;
	  private String transChallengeExemption;
	  private CardHolderInfo cardholderInfo;
	  private String deviceInfoRecognisedVersion;
	  private String cardSecurityCodeStatusSource;
	  private List<WebAuthnCred> webAuthnCredList;
	  private String trustListStatus;
	  private String cardSecurityCodeStatus;
	  private String threeDSRequestorAppURLInd;
	  private String acsDecConInd;
	  private String transStatusReasonInfo;
	  private String deviceBindingStatus;
}
