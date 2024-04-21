package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.JSONObject;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class MessageExtension implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -3624844750087781301L;

	/***
	 * A Boolean value indicating whether the recipient must understand the contents
	 * of the extension to interpret the entire message
	 **/
	private Boolean criticalityIndicator;

	/** The data carried in the extension */
	private JSONObject data;

	/***
	 * A unique identifier for the extension. Note: Payment System Registered
	 * Application Provider Identifier (RID) is required as prefix of the ID
	 */
	private String id;

	/*** The name of the extension data set as defined by the extension owner */
	private String name;

}
