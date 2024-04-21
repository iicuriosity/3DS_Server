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
public class RecurringInd implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2744850076144828462L;
	
	private String amountInd;
	private String frequencyInd;

}
