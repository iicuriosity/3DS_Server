package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.tools.CardNumberFormatter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.JSONObject;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class PayTokenInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6627659202110859145L;
	@ToString.Exclude
	private String token;
	private JSONObject tokenAdditionalData;
	private String tokenAssuranceMethod;
	private String tokenRequestorId;
	private String tokenCryptogram;
	private String tokenCryptogramValidityIndicator;
	private String tokenStatusIndicator;
	
	@ToString.Include(name = "token") // Include this custom method in toString
    public String getMaskedToken() {
        return CardNumberFormatter.hideCardNumber(token);
    }

}
