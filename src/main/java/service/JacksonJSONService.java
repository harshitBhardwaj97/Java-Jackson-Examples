package service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface JacksonJSONService {

    String convertPOJOToJsonString(Object object) throws JsonProcessingException;

    <T> T convertJsonStringToPOJO(String json, Class<T> clazz) throws JsonProcessingException;
}
