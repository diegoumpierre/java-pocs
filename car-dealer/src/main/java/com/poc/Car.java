package com.poc;

import lombok.Data;

@Data
public class Car {
    private String maker;
    private String model;
    private int year;
    private Double price;
    private int miles;
}