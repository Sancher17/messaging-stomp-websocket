package com.example.messagingstompwebsocket.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private String code;
    private String message;
    private String result;
    private String description;
    private String transactionId;
    private com.example.messagingstompwebsocket.model.Data data;
}
