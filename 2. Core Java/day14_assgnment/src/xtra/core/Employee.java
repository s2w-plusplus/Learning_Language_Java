package xtra.core;

import xtra.composite_primary.empPK;

public class Employee {

	private empPK compPK;
	private String name;
	
	public Employee(int empID, String dept,String name) {
		//this.empPK(empID,dept);
		this.name = name;
	}

	@Override
	public int hashCode() {
		return compPK.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		 if ( compPK.equals(obj) )
			 return true;
		 return false;
	}
		
	
	
	
	
	
	
	
	
}

