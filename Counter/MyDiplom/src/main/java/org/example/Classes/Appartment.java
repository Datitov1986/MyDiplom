package org.example.Classes;

public class Appartment {
    private String name;
    private Counter coldWater;
    private Counter hotWater;
    private Counter electricT1;
    private Counter electricT2;
    private double square;

    public Appartment(String name, Counter coldWater, Counter hotWater,
                      Counter electricT1, Counter electricT2, double square) {
        this.name = name;
        this.coldWater = coldWater;
        this.hotWater = hotWater;
        this.electricT1 = electricT1;
        this.electricT2 = electricT2;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Counter getColdWater() {
        return coldWater;
    }

    public void setColdWater(Counter coldWater) {
        this.coldWater = coldWater;
    }

    public Counter getHotWater() {
        return hotWater;
    }

    public void setHotWater(Counter hotWater) {
        this.hotWater = hotWater;
    }

    public Counter getElectricT1() {
        return electricT1;
    }

    public void setElectricT1(Counter electricT1) {
        this.electricT1 = electricT1;
    }

    public Counter getElectricT2() {
        return electricT2;
    }

    public void setElectricT2(Counter electricT2) {
        this.electricT2 = electricT2;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Квартира " +
                 name + '\'' +
                ", холодная вода: " + coldWater +
                ", горячая вода: " + hotWater +
                ", электричество Т1: " + electricT1 +
                ", электричество Т2: " + electricT2 +
                ", площадь квартиры: " + square;
    }
}
