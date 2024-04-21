package com.tds.entities.message.response.ares;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.JSONObject;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class ARes2_1 extends ARes{

	/**
	 * 
	 */
	private static final long serialVersionUID = -430353640650953897L;
	
	  private JSONObject broadInfo;
	  private String authenticationType;
	  private String cardholderInfo;

}
