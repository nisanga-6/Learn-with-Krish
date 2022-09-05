package com.Example.Builder;

public class AddEmployee {

    public static void main(String[] args){

        Employee emp = new EmployeeBuilder().setName("Nisanga").setAge(27).getEmployee();
        System.out.println(emp);
    }
}
