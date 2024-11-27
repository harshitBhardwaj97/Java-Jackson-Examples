package service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import service.JacksonJSONService;

public class JacksonJSONServiceImpl implements JacksonJSONService {

    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    public String convertPOJOToJsonString(Object object) throws JsonProcessingException {
        return mapper.writeValueAsString(object);
    }

    @Override
    public <T> T convertJsonStringToPOJO(String json, Class<T> clazz) throws JsonProcessingException {
        return mapper.readValue(json, clazz);
    }
}
