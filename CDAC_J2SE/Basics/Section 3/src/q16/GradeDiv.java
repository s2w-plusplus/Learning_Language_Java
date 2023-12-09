package q16;
/*
16. Write a java program to ask user to enter test marks of three subjects such as Phy, Chem, Math. Max marks for each subject is 100. Now calculate average of marks. Display following message based on average marks calculated - 

avg < 30 : You are failed.
avg >= 30 but < 60 : You passed with Second division
avg >=60 but < 80 : You passed wirh Fiear division
avg>=80 : You passed with First class distinction
*/

import java.util.Scanner;
 class GradeDiv{
	 
	public static void main(String args[]){
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Input the marks of Physics, Chemistry and Math: ");
	int pys=scan.nextInt();
	int chem=scan.nextInt();
	int math=scan.nextInt();
	double avg=(pys+chem+math)/3;
	
	if(avg>=80) System.out.println("You passed with First class distinction");	
	else if(avg>=60) System.out.println("You passed wirh First division");
	else if(avg>=30) System.out.println("You passed with Second division");
	else System.out.println("You are failed.");
	}
	 
	 
 }