package com.example.testJackson.jsontest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {

@JsonProperty("beerId")
    private UUID id;
    @Nullable
    private Integer version;
    @JsonSerialize(using = OffsetDateTimeSerializer.class)
   // @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createdDate;

   @JsonSerialize(using = OffsetDateTimeSerializer.class)

    private OffsetDateTime lastModified;

    private String beerName;

    private String beerStyleEnum;

    private Long upc;
  @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    private Integer quantityOnHand;
}
