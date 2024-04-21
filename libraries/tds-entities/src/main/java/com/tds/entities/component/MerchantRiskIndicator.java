package com.tds.entities.component;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class MerchantRiskIndicator implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = -5127447926250411332L;

	private String deliveryEmailAddress;
	private String deliveryTimeframe;
	private String giftCardAmount;
	private String giftCardCount;
	private String giftCardCurr;
	private String preOrderDate;
	private String preOrderPurchaseInd;
	private String reorderItemsInd;
	private String shipIndicator;
	private List<String> transChar;

}
