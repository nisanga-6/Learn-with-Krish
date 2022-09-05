package com.Example.Prototype;

public class fullTimeEmployee extends Employee{

    private int Salary;
    private int allowance;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "fullTimeEmployee{" +
                "Salary=" + Salary +
                ", allowance=" + allowance +
                '}';
    }
}
