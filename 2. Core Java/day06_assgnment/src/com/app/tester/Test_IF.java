package com.app.tester;

import java.util.Scanner;
import com.app.LIFO.Employee;
import com.app.LIFO.Stack;
import com.app.LIFO.FixedStack;
import com.app.LIFO.GrowableStack;

public class Test_IF {
	
public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	Stack S = null;
	boolean Exit=false;
	System.out.println("****Provide Details To Be Stacked****");
	while(!Exit)
	{
		System.out.println("Choose Appropriate Options");
		System.out.println("1.Choose FixedStack");
		System.out.println("2.Choose GrowableStack");
		System.out.println("3.Push");
		System.out.println("4.Pop");
		System.out.println("5.Exit");
		
		switch(scan.nextInt()) 
		{
		case 1:
					if(S==null) S=new FixedStack();
					else System.out.println("The Stack Type has already been Selected!");
					break;
		case 2:
					if(S==null) S=new GrowableStack();
					else System.out.println("The Stack Type has already been Selected!");
					break;
		case 3:
					try {
							System.out.println("Enter the <ID><NAME><Salary> of the Employee.");
							Employee emp=new Employee(scan.nextInt(),scan.next(),scan.nextInt());
							S.push(emp);
						  }catch(ArrayIndexOutOfBoundsException X) {
							  	System.out.println("The GrowableStack has reached its limits...");
							  	System.out.println("Extending its Bounds.....");
							  	S=new GrowableStack( ((GrowableStack)S) );
							  	System.out.println("Lets Try Again");
							  	System.out.println("Enter the <ID><NAME><Salary> of the Employee.");
							  	Employee emp=new Employee(scan.nextInt(),scan.next(),scan.nextInt());
							  	S.push(emp);
						  		}
					//variables declared in try, not in scope of catch???
					break;
		case 4:
					Employee A=S.pop();
			        if(A!=null)
			        	System.out.println("The top of the Stack had-->"+A);
			        else
			        	System.out.println("Stack Underflow!!");
			        break;
		case 5:
					Exit=true;
					break;
		default:
					System.out.println("Invalid Choice!");
					break;
		}
	}
	scan.close();
	}
}
