package com.child.client.impl;

import com.child.client.api.IAuthenticationClient;
import com.child.client.connector.HttpConnector;
import com.child.client.utility.JsonUtility;
import com.child.model.response.HealthCheckResponse;

public class AuthenticationClient implements IAuthenticationClient {


    @Override
    public HealthCheckResponse getHealthCheckData() {

        HealthCheckResponse healthCheckResponse = null;
        String url = "http://localhost:8080/health";
        String response = HttpConnector.getCall(url);

        return JsonUtility.convertJsonToObject(response, HealthCheckResponse.class);
    }
}
