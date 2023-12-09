package q01;
/*1. Create a class Emp with fields like empId, name,dept,salary,address.
     Write required constructors for initialization
     Write a method displayEmpDetails() in the same class.
    
     Write another test class, where you have to take emp details from user 
     using Scanner and create object and call methods.
*/

import java.util.Scanner;
public class testEmp{

	public static void main(String args[]){
                
	Scanner scan = new Scanner(System.in);
        
	System.out.println("Enter employee name");
    String nm=scan.nextLine();
	System.out.println("Enter department");
	String dpt=scan.nextLine();
	System.out.println("Enter address");
	String ad=scan.nextLine();
	System.out.println("Enter employee Id");
 	int eid=scan.nextInt();                                 
	System.out.println("Enter Salary");
 	int slry=scan.nextInt();                                 
       		
    Emp e1 = new Emp(nm,dpt,ad,eid,slry);

	e1.displayEmpDetails();		
	}

}
