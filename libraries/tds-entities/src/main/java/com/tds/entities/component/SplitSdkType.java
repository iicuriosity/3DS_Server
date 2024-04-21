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
public class SplitSdkType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -577010215592585607L;
	
	private String sdkVariant;
	private String limitedInd;
}
