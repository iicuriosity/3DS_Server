package com.tds.entities.component;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString(callSuper = true)
public class PSImage implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5811665253442617483L;
	
	private String monochrome;
	@JsonProperty("default")
	private String defaultImage;
	private String dark;

}
