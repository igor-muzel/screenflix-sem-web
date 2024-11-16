package br.com.projeto.screenflix.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertData {
    private final ObjectMapper mapper = new ObjectMapper();


    //desserializa o formato json para o mapeamento do DataSeries
    @Override
    public <T> T getData(String json, Class<T> tClass) throws JsonProcessingException {
        return mapper.readValue(json, tClass);
    }
}
