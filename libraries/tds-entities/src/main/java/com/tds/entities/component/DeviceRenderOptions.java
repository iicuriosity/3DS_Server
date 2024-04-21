package com.tds.entities.component;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class DeviceRenderOptions implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 6393626499942426986L;

	private String sdkInterface;
	private List<String> sdkUiType;
	private List<String> sdkAuthenticationType;
}
