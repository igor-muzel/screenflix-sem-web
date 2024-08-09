package br.com.projeto.screenflix.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConvertsData {
    <T>T getData(String json, Class<T> classData) throws JsonProcessingException;
}
