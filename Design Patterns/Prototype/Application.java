package com.Example.Prototype;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Registry reg = new Registry();

        fullTimeEmployee emp = (fullTimeEmployee) reg.getEmployee(EmployeeType.FULL_TIME);
        System.out.println(emp);

        emp.setSalary(100000);
        System.out.println(emp);

        fullTimeEmployee emp1 = (fullTimeEmployee) reg.getEmployee(EmployeeType.FULL_TIME);
        System.out.println(emp1);

    }

}
