package com.Example.Factory;

import java.util.Scanner;

public class FactoryPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the calculation type");

        String type = sc.next();

        calculateFactory obj1 = new calculateFactory();
        Calculate obj2 =  obj1.getCalculation(type);
        obj2.calculate(200,500);



    }
}
