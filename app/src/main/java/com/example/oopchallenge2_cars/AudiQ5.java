package com.example.oopchallenge2_cars;

public class AudiQ5 extends Audi {

    public AudiQ5(String make, String model, int horsepower, int price) {
        super(make, model, horsepower, price);
    }

    @Override
    public void Accelerate0to100() {
        super.Accelerate0to100();
        System.out.println("Accomplished in 7 seconds");
    }
}
