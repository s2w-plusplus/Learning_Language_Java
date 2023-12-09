package com.app.core;

import java.util.Date;

public class Customer {

	private String name;
	private String Email;
	private String Password;
	private double registrationAmount;
	private Date dob;
	public AccessLevel Cplan;
	
	
	public Customer(String name, String email, String password, double registrationAmount 
			,Date dob,AccessLevel cplan) 
	{	
		this.name = name;
		Email = email;
		Password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		Cplan = cplan;
	}
	
	public Customer(String email) 
	{	
		this(null,email,null,0.0,null,null);
	}
	
	
	@Override
	public String toString() {
		return "Customer Details[Name=" + name + ", Email=" + Email + ", Password=" + Password + ", RegistrationAmount="
				+ registrationAmount + ", DateOfBirth=" + dob + ", Current Plan=" + Cplan + "]";
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Customer) 
			return (this.Email).equals(((Customer)o).Email) ;	
		return false;
	}	
}
