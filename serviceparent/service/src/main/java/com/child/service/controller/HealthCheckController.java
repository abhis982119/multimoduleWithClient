package com.child.service.controller;

import com.child.model.response.HealthCheckResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {


    @GetMapping
    public HealthCheckResponse heathCheck() {

        HealthCheckResponse response = HealthCheckResponse.builder()
                .msg("Updated data msg. Service is up. ")
                .status(200)
                .build();
        System.out.println(response);

        return response;
    }





   /* @GetMapping
    public String  heathCheck(){
        String msg = "{ \"msg\" : \"Machine is up\",\n" +
                "\"status\": 200}";
        System.out.println(msg);
        return msg;
    }*/
}
