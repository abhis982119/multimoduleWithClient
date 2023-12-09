package com.child.client.connector;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpConnector {

    public static String getCall(String url){
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response
                = restTemplate.getForEntity(url,String.class );

        return response.getBody();

    }
}
