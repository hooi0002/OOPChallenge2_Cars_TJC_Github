package com.example.oopchallenge2_cars;

public class Automobile {

    private String make;
    private String model;
    private int horsepower;
    private int price;

    public Automobile(String make, String model, int horsepower, int price) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
        this.price = price;
    }

    public void Accelerate0to100() {
        System.out.println("Acceleration begins...");
    }

    public void getDetails() {
        System.out.println(make + " " + model + " has " + horsepower + " horsepower");
        System.out.println("It costs SGD" + price + "\n");
    }

}
