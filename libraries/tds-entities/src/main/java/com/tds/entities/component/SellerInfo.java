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
public class SellerInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 540046055026012292L;
	
	private String sellerName;
	private String sellerId;
	private String sellerBusinessName;
	private String sellerAccDate;
	private String sellerAddrLine1;
	private String sellerAddrLine2;
	private String sellerAddrLine3;
	private String sellerAddrCity;
	private String sellerAddrState;
	private String sellerAddrPostCode;
	private String sellerAddrCountry;
	private String sellerEmail;
	private PhoneNumber sellerPhone;
}
