package com.tds.entities.message.response.ares;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class ARes2_2 extends ARes2_1 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7776089679044606854L;

	private String whiteListStatusSource;
	private String whiteListStatus;
	private String acsDecConInd;

}
