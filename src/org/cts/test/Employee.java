package org.cts.test;

public class Employee {
	public void empDetails() {
		System.out.println("Emp details");
	}
	public void empDetails(int id) {
		System.out.println("Emp Id"+id);
	}
	public void empDetails(int id,int exp) {
		System.out.println("Emp Id  "+id+"exp  "+exp);
	}
	
	public void empDetails(long phNo) {
		System.out.println("Emp phone no  :"+phNo);
	}
	public void empDetails(String name,int age) {
		System.out.println("Emp name  :"+name+"  "+age);
	}
	public void empDetails(int age,String name) {
		System.out.println("Emp name :"+name+"  "+age);
	}
	public void empDetails(float salary) {
		System.out.println("Emp salary  :"+salary);
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empDetails();
		e.empDetails(101);
		e.empDetails(101,3);
		e.empDetails(12345678909l);
		e.empDetails(25,"Nivetha");
		e.empDetails("Nive",45);
		e.empDetails(23456.345f);
		
	}
	
}
