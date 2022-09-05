package com.Example.Prototype;

public class partTimeEmployee extends Employee{

    private int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "partTimeEmployee{" +
                "Salary=" + Salary +
                '}';
    }
}
