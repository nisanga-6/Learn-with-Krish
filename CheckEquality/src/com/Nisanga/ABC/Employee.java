package com.Nisanga.ABC;

public class Employee {
	
	private int id;
	private int code;
	private String name;
	private int nic;
	private String address;
	public Employee(int id, int code, String name, int nic, String address) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.nic = nic;
		this.address = address;
	}
	
	
	
	public Employee(int id, int code) {
		super();
		this.id = id;
		this.code = code;
	}



	public Boolean Equals(Object o) {
		
		if(o == this) {
			
			return true;
		}
		
		if(!( o instanceof Employee)) {
			
			return false;
		}
	
	  Employee e = (Employee) o;
	  
	  return Double.compare(id, e.id)==0 && Double.compare(code, e.code)==0;
	}

}
