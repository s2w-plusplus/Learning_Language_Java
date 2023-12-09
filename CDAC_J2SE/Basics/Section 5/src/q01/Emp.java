package q01;
/*1. Create a class Emp with fields like empId, name,dept,salary,address.
     Write required constructors for initialization
     Write a method displayEmpDetails() in the same class.
    
     Write another test class , where you have to take emp details from user using Scanner and create object and call methods.
*/



public class Emp{
	// state (instance variables)
  String name;
  String dept;
  String address;
  int empId;
  int salary;
  
	  // Behavior (instance methods/functions)
  Emp(){}
  Emp(String n,String d,String add,int id,int sal){
    name=n;
    dept=d;
    address=add;
    empId=id;
    salary=sal;	 
  }
  
  public void displayEmpDetails(){

  System.out.println("Name: "+name+"\nDepartment= "+ dept +"\nAddress= "+ address +"\nEmployee ID= "+ empId +"\nSalary= "+ salary);	 
  }

}
