package com.example.oopchallenge2_cars;

public class AudiR8 extends Audi {

    public AudiR8(String make, String model, int horsepower, int price) {
        super(make, model, horsepower, price);
    }

    @Override
    public void Accelerate0to100() {
        super.Accelerate0to100();
        System.out.println("Accomplished in 3 seconds");
    }
}
