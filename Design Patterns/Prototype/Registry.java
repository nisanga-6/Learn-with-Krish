package com.Example.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<EmployeeType, Employee> employee = new HashMap<>();

    public Registry(){


        this.initialize();
    }

    public Employee getEmployee(EmployeeType employeeType) {

        Employee emp=null;
        try {
            emp = (Employee) employee.get(employeeType).clone();
        }catch(CloneNotSupportedException e) {

            e.printStackTrace();
        }
        return emp;

    }

    private void initialize() {

        partTimeEmployee partTimeEmployee1 = new partTimeEmployee();
        partTimeEmployee1.setId(1);
        partTimeEmployee1.setName("Ashan");
        partTimeEmployee1.setSalary(50000);

        fullTimeEmployee fullTimeEmployee = new fullTimeEmployee();
        fullTimeEmployee.setId(2);
        fullTimeEmployee.setName("Gihan");
        fullTimeEmployee.setSalary(80000);
        fullTimeEmployee.setAllowance(30000);

        employee.put(EmployeeType.PART_TIME,partTimeEmployee1);
        employee.put(EmployeeType.FULL_TIME,fullTimeEmployee);

    }
}
