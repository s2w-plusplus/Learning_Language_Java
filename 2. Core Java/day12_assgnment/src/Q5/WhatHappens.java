package Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Emp{
	
}
class Mgr extends Emp{
	
}
class SalesMgr extends Mgr{
	
}

public class WhatHappens {

	public static void main(String[] args) {
	
		ArrayList<Emp> list = new ArrayList<>(Arrays.asList(new Emp(), new Mgr(), new SalesMgr()));
		list.add(new SalesMgr());
		displayDetails(list);
		
		// What will happen ?
		
		//ArrayList<Mgr> list2 = new ArrayList<>(Arrays.asList(new Mgr(), new SalesMgr(),new Mgr()));
		//displayDetails(list2); 
		// uncomment to know answer to this question
	}

	
		// add a static method to display Emp/Mgr/Worker details from any collection
		public static void displayDetails(Collection<Emp> emps) {
			
			for (Emp e : emps)
			System.out.println(e);
		}
}
