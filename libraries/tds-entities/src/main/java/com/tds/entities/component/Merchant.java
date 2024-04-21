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
public class Merchant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1286347649898672700L;
	
	private String merchantNameListed;
	private String acquirerMerchantIdListed;
	private String merchantAmount;
	private String merchantCurrency;
	private String merchantExponent;
	private String sellerId;
}
