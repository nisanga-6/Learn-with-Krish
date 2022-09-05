package com.Example.Factory;

public class Substract implements Calculate{
    @Override
    public void calculate(double a, double b) {

        System.out.println(a-b);
    }
}
