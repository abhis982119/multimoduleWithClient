package com.child.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class HealthCheckResponse {

    private String msg;

    private int status;

}
