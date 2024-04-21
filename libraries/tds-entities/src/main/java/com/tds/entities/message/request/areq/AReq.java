package com.tds.entities.message.request.areq;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.AcctInfo;
import com.tds.entities.component.DeviceRenderOptions;
import com.tds.entities.component.MerchantRiskIndicator;
import com.tds.entities.component.MessageExtension;
import com.tds.entities.component.PhoneNumber;
import com.tds.entities.component.SdkEphemPubKey;
import com.tds.entities.constants.MessageType;
import com.tds.entities.message.request.TdsRequest;
import com.tds.tools.CardNumberFormatter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public abstract class AReq implements TdsRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -16361605615503201L;

	private String messageVersion;
	private String messageType;
	private String threeDSServerTransID;
	private String acsTransID;
	private String dsTransID;
	private String sdkTransID;
	private List<MessageExtension> messageExtension;

	@ToString.Exclude
	private String acctNumber;
	private String threeDSServerURL;
	private String sdkReferenceNumber;
	private String shipAddrLine1;
	private String userId;
	private String billAddrCountry;
	private String sdkEncData;
	private String browserColorDepth;
	private String threeDSCompInd;
	private String merchantCountryCode;
	private String purchaseDate;
	private String billAddrState;
	private Boolean payTokenInd;
	private String messageCategory;
	private PhoneNumber homePhone;
	private String billAddrLine1;
	private String threeDSRequestorURL;
	private String recurringFrequency;
	private String purchaseInstalData;
	private String sdkMaxTimeout;
	private String shipAddrLine2;
	private String acctID;
	private String browserUserAgent;
	private PhoneNumber mobilePhone;
	private String shipAddrCountry;
	private DeviceRenderOptions deviceRenderOptions;
	private String sdkAppID;
	private String dsURL;
	private String billAddrPostCode;
	private String billAddrLine3;
	private String notificationURL;
	private String purchaseCurrency;
	private String threeDSServerOperatorID;
	private String threeDSRequestorName;
	private String browserAcceptHeader;
	private String cardExpiryDate;
	private String threeDSRequestorAuthenticationInd;
	private String shipAddrLine3;
	private String threeRIInd;
	private String mcc;
	private String threeDSRequestorID;
	private String dsReferenceNumber;
	private String browserTZ;
	private String recurringExpiry;
	private String billAddrLine2;
	private String acctType;
	private MerchantRiskIndicator merchantRiskIndicator;
	private String deviceInfo;
	private String shipAddrCity;
	private String deviceChannel;
	private String threeDSServerRefNumber;
	private String shipAddrState;
	private String acquirerBIN;
	private String browserScreenWidth;
	private PhoneNumber workPhone;
	private String purchaseExponent;
	private String purchaseAmount;
	private SdkEphemPubKey sdkEphemPubKey;
	private String shipAddrPostCode;
	private String browserLanguage;
	private String email;
	private Boolean browserJavaEnabled;
	private String billAddrCity;
	private String addrMatch;
	private String browserScreenHeight;
	private String deviceId;
	private String browserIP;
	private String merchantName;
	private String transType;
	private String cardholderName;
	private AcctInfo acctInfo;
	private String acquirerMerchantID;

	@ToString.Include(name = "acctNumber")
	public String getMaskedAcctNumber() {
		return CardNumberFormatter.hideCardNumber(acctNumber);
	}
	
	public AReq() {
		setMessageType(MessageType.AReq);
	}

}
