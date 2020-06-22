package com.example.oopchallenge2_cars;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ToyotaCamry toyotaCamry = new ToyotaCamry("Toyota", "Camry 2.4", 160, 120000);
        BMW530i bmw530i = new BMW530i("BMW", "530i Sedan", 220, 200000);
        AudiQ5 audiQ5 = new AudiQ5("Audi", "Q5 3.0", 210, 180000);
        AudiR8 audiR8 = new AudiR8("Audi", "R8 5.2 V10+", 550, 700000);

        while(true) {

            System.out.println("1. Toyota Camry\n2. BMW 530i\n3. Audi Q5\n4. Audi R8");
            System.out.println("Please Enter A Number: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    toyotaCamry.Accelerate0to100();
                    toyotaCamry.getDetails();
                    break;

                case 2:
                    bmw530i.Accelerate0to100();
                    bmw530i.getDetails();
                    break;

                case 3:
                    audiQ5.Accelerate0to100();
                    audiQ5.getDetails();
                    break;

                case 4:
                    audiR8.Accelerate0to100();
                    audiR8.getDetails();

                default:
                    break;
            }
        }
    }
}
