package com.app.LIFO;

public class Employee{
	private int ID;
	private String Name;
	private int Salary;
	
	public Employee(int iD, String name, int salary) {
		ID = iD;
		Name = name;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + "]";
	} 
	

}
