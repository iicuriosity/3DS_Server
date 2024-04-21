package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class AcctInfo implements Serializable {

	  private static final long serialVersionUID = 1111572605745961768L;

	  private String chAccAgeInd;
	  private String chAccChange;
	  private String chAccChangeInd;
	  private String chAccDate;
	  private String chAccPwChange;
	  private String chAccPwChangeInd;
	  private String nbPurchaseAccount;
	  private String chAccReqID;
	  private String provisionAttemptsDay;
	  private String txnActivityDay;
	  private String txnActivityYear;
	  private String paymentAccAge;
	  private String paymentAccInd;
	  private String shipAddressUsage; 
	  private String shipAddressUsageInd;
	  private String shipNameIndicator;
	  private String suspiciousAccActivity;
}
