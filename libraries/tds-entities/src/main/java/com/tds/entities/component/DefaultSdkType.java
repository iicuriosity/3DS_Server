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
public class DefaultSdkType implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 2308920506588424188L;

	private String sdkVariant;
	private String wrappedInd;
}
