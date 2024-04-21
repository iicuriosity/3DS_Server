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
public class AcsRenderingType implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 3407121158788398532L;

	private String acsInterface;
	private String acsUiTemplate;
	private String deviceUserInterfaceMode;
}
