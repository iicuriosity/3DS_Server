package com.tds.entities.message;

import java.io.Serializable;
import java.util.List;

import com.tds.entities.component.MessageExtension;

public interface TdsMessage extends Serializable{

	String getMessageVersion();
	String getMessageType();
	String getThreeDSServerTransID();
	String getAcsTransID();
	String getDsTransID();
	String getSdkTransID();

	List<MessageExtension> getMessageExtension();

}
