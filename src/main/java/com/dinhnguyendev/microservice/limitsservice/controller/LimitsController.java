package com.dinhnguyendev.microservice.limitsservice.controller;


import com.dinhnguyendev.microservice.limitsservice.configuration.Configuration;
import com.dinhnguyendev.microservice.limitsservice.dto.response.LimitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("limits")
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping
    public LimitResponse getLimit(){
        return LimitResponse.builder()
                .minimum(this.configuration.getMinimum())
                .maximum(this.configuration.getMaximum())
                .build();
    }
}
