package com.example.testJackson.jsontest.models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {

    BeerDto getBeerDto(){
        return BeerDto.builder()
                .beerName("Coca")
                .beerStyleEnum("WHEAT")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModified(OffsetDateTime.now())
                .price(new BigDecimal(3.89))
                .quantityOnHand(202)
                .upc(12534348L)
                .build();
    }

}