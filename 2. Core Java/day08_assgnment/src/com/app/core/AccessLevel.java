package com.app.core;

public enum AccessLevel 
{	
		SILVER,GOLD,PLATINUM;
		
	@Override
	public String toString() 
	{
		return  name().toLowerCase();
	}
	
}
