package com.dinhnguyendev.microservice.limitsservice.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LimitResponse {

    private int minimum;
    private int maximum;

}
