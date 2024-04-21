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
public class PhoneNumber implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8609762857967803336L;
	
	private String cc;
	private String subscriber;
}
