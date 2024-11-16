package br.com.projeto.screenflix.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConvertDates {
    <T>T getData(String json, Class<T> tClass) throws JsonProcessingException;
}
