package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class CardHolderInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8295860634275808616L;
	
	private String paymentSystemImage;
	private String issuerImage;
	private String text;
}
