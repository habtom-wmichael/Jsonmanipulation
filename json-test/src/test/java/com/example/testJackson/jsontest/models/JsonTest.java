package com.example.testJackson.jsontest.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.boot.test.autoconfigure.json.JsonTest
public class JsonTest extends BaseTest {
    @Autowired
    ObjectMapper objectMapper;
    BeerDto beerDto = getBeerDto();

    @Test
    void serialize() throws JsonProcessingException {
        String dto = objectMapper.writeValueAsString(beerDto);
        System.out.println(dto);
    }

    @Test
    void deSerialization() throws JsonProcessingException {
        String dto = objectMapper.writeValueAsString(beerDto);
        BeerDto newBeerDto = objectMapper.readValue(dto, BeerDto.class);
        System.out.println(newBeerDto);
    }
}
