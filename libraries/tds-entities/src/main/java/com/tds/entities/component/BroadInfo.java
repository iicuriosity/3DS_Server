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
public class BroadInfo implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = -4190351422992532647L;

	private String category;
	private String description;
	private String expDate;
	private String severity;
	private List<String> recipients;
	private String source;

}
