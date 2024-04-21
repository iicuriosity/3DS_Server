package com.tds.entities.message.request.rreq;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class RReq2_2 extends RReq2_1{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1114301777356190716L;
	
	private String whiteListStatus;
	private String whiteListStatusSource;
	

}
