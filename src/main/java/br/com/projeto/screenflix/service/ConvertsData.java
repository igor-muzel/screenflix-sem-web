package br.com.projeto.screenflix.service;

import br.com.projeto.screenflix.model.SeriesData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertsData implements IConvertsData{
   private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> classData) throws JsonProcessingException {
        try {
            return mapper.readValue(json, classData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
