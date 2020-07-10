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
        String jsonDto = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonDto);
    }

    @Test
    void deSerialization() throws JsonProcessingException {
        String dto = "{\"version\":null,\"createdDate\":\"2020-07-10T00:47:58.833269-05:00\",\"lastModified\":\"2020-07-10T00:47:58.835548-05:00\",\"beerName\":\"Coca\",\"beerStyleEnum\":\"WHEAT\",\"upc\":12534348,\"price\":\"3.890000000000000124344978758017532527446746826171875\",\"quantityOnHand\":202,\"beerId\":\"9681e829-bdc1-431c-a4eb-38564be9da5d\"}";
        BeerDto newBeerDto = objectMapper.readValue(dto, BeerDto.class);
        System.out.println(newBeerDto);
    }
}
