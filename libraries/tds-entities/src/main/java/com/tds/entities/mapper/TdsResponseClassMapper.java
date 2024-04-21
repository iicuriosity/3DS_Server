package com.tds.entities.mapper;

public interface TdsResponseClassMapper {

	Class<?> getResponseClass(String messageType, String messageVersion);
}
