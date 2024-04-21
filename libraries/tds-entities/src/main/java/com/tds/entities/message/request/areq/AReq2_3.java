package com.tds.entities.message.request.areq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.BroadInfo;
import com.tds.entities.component.DefaultSdkType;
import com.tds.entities.component.MultiTransaction;
import com.tds.entities.component.PayTokenInfo;
import com.tds.entities.component.RecurringInd;
import com.tds.entities.component.SellerInfo;
import com.tds.entities.component.SplitSdkType;
import com.tds.entities.component.ThreeDSRequestorAuthenticationInfo;
import com.tds.entities.component.ThreeDSRequestorPriorAuthenticationInfo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class AReq2_3 extends AReq {
	/**
	* 
	*/
	private static final long serialVersionUID = 8810629763414855562L;

	private String threeDSMethodId;
	private String recurringCurrency;
	private PayTokenInfo payTokenInfo;
	private RecurringInd recurringInd;
	private List<String> threeDSRequestorChallengeInd;
	private String threeDSRequestorDecMaxTime;
	private String payTokenSource;
	private String cardSecurityCodeStatus;
	private BroadInfo broadInfo;
	private String recurringExponent;
	private List<ThreeDSRequestorPriorAuthenticationInfo> threeDSRequestorPriorAuthenticationInfo;
	private String deviceId;
	private String trustListStatusSource;
	private String userId;
	private List<SellerInfo> sellerInfo;
	private String acquirerCountryCodeSource;
	private String spcIncompInd;
	private String payeeOrigin;
	private String cardSecurityCodeStatusSource;
	private String threeDSRequestorSpcSupport;
	private String taxId;
	private SplitSdkType splitSdkType;
	private String recurringDate;
	private String acquirerCountryCode;
	private String appIp;
	private String sdkType;
	private String cardSecurityCode;
	private DefaultSdkType defaultSdkType;
	private Boolean browserJavascriptEnabled;
	private List<String> acceptLanguage;
	private String recurringAmount;
	private String threeDSRequestorDecReqInd;
	private String deviceBindingStatusSource;
	private String trustListStatus;
	private String sdkServerSignedContent;
	private List<ThreeDSRequestorAuthenticationInfo> threeDSRequestorAuthenticationInfo;
	private MultiTransaction multiTransaction;
	private String deviceBindingStatus;

}
