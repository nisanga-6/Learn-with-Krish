package com.Nisanga.ABC;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1,1000);
		Employee e2 = new Employee(1,1000);
		
		Employee e3 = new Employee(2,1000);
		
		if(e1.Equals(e2)) {
			System.out.println("Equal");
			}
		else {
			System.out.println("Not Equal");
		}
		
		if(e1.Equals(e3)) {
			System.out.println("Equal");
			}
		
		else {
			System.out.println("Not Equal");
		}

	}

}
