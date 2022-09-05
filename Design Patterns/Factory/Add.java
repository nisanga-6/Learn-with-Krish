package com.Example.Factory;

public class Add implements Calculate {


    @Override
    public void calculate(double a, double b) {

        System.out.println( b + a );
    }
}
