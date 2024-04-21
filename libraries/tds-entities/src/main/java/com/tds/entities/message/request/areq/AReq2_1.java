package com.tds.entities.message.request.areq;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tds.entities.component.ThreeDSRequestorAuthenticationInfo;
import com.tds.entities.component.ThreeDSRequestorPriorAuthenticationInfo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.JSONObject;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class AReq2_1 extends AReq {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5330796675575208582L;

	private JSONObject broadInfo;
	private String threeDSRequestorChallengeInd;
	private ThreeDSRequestorAuthenticationInfo threeDSRequestorAuthenticationInfo;
	private ThreeDSRequestorPriorAuthenticationInfo threeDSRequestorPriorAuthenticationInfo;
}
