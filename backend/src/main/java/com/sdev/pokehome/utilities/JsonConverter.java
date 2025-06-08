package com.sdev.pokehome.utilities;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class JsonConverter implements AttributeConverter<Object, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Object attribute) {
        try {
            return objectMapper.writeValueAsString(attribute); // Java ➜ JSON
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Erro ao converter objeto para JSON", e);
        }
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, Object.class); // JSON ➜ Java
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao converter JSON para objeto", e);
        }
    }
}