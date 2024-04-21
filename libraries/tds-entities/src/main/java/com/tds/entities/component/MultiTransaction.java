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
public class MultiTransaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6279713864212014421L;
	
	private List<Merchant> merchantList;
	private String avValidityTime;
	private String avNumberUse;
}
