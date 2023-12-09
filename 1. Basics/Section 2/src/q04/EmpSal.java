package q04;
/*
4. Write a program to calculate the monthly in hand salary of an employee : 
	take input for basic salary,
	HRA is 40% of basic salary,
	PF amount to be deducted is 12% of basic,
	Medical allowance is Rs 1200 per month, 
	Traveling allowance is Rs 800 per month,
	Professional tax to be deducted is Rs 300.
*/	
import java.util.Scanner;
class EmpSal{
	
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Let's Calculate your in-hand salary..");
	System.out.println("What is your Basic Salary? ");
	int sal=scan.nextInt();
	double inHand= (sal*(1+0.4-0.12))+1200+800-300 ;
	System.out.println("Your in-hand salary is: "+ inHand);
	}



}