package com.app.vehicles;

public class Vehicle 
{
	private String registrationNo;
	private String color;
	private double price;
	
	public Vehicle(String registrationNo, String color, double price)
	{
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price + "]";
	}

	@Override//lifesaver
	public boolean equals(Object V) 
	{
	 if( V instanceof Vehicle)
		 return (this.registrationNo.equals( ((Vehicle)V).registrationNo) );
	 return false;
	}
}