package com.example.projects.example.dtos.outbound;

import com.example.projects.example.util.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Mike on 9/3/2016.
 */
public class AnswerDto {

    @JsonProperty
    private int value;

    @JsonProperty
    private int firstParam;

    @JsonProperty
    private int secondParam;

    @JsonProperty
    private Operation operation;

    public AnswerDto() {
    }

    public AnswerDto(int firstParam, int secondParam, int value, Operation operation) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.operation = operation;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(int firstParam) {
        this.firstParam = firstParam;
    }

    public int getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(int secondParam) {
        this.secondParam = secondParam;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

}
