package com.example.projects.example.entities;

import com.example.projects.example.util.Operation;

import javax.persistence.*;

/**
 * Created by Mike on 9/4/2016.
 */
@Entity
@Table(schema = "dbo", name = "exampletable")
public class AnswerEntity {

    @Id
    @Column(name="pk")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="FirstParam")
    private int firstParam;

    @Column(name="SecondParam")
    private int secondParam;

    @Column(name="Answer")
    private int value;

    @Column(name = "Operation")
    @Enumerated(EnumType.STRING)
    private Operation operation;

    public AnswerEntity() {
    }

    public AnswerEntity(int firstParam, int secondParam, int value, Operation operation) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.operation = operation;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

}
