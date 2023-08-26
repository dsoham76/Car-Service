package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarService carService=new CarService();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Car Type (Hatchback/Sedan/SUV):");
        String carType=sc.nextLine();

        System.out.println("Enter service codes (separated by commas)");
        String serviceCodes=sc.nextLine();

        carService.generateBill(carType,serviceCodes);
        

    }
}