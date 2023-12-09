package q11;
/*
11. Write a java program to read roll no, name and marks of three subjects and calculate the total, percentage and division. 

Test Data :
Input the Roll Number of the student :784
Input the Name of the Student :James
Input the marks of Physics, Chemistry and Computer Application : 70 80 90

Expected Output :
Roll No : 784
Name of Student : James
Marks in Physics : 70
Marks in Chemistry : 80
Marks in Computer Application : 90
Total Marks = 240
Percentage = 80.00
Division = First
*/

import java.util.Scanner;
 class Percnt_Div{
	 
	public static void main(String args[]){
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Input the Roll Number of the student: ");
	int R=scan.nextInt();
	System.out.println("Input the Name of the Student : ");
	String nm=scan.next();
	System.out.println("Input the marks of Physics, Chemistry and Computer Application: ");
	int py=scan.nextInt();
	int c=scan.nextInt();
	int ca=scan.nextInt();
	double p=(py+c+ca)/3;
	System.out.println("\nTotal Marks = "+ (py+c+ca));
	System.out.println("Percentage = "+p+" %");	
	if(p>67) System.out.println("Division = First Class with Distinction");	
	else if(p>60) System.out.println("Division = First Class");
	else if(p>55) System.out.println("Division = Higher Second Class");	
	else if(p>50) System.out.println("Division = Second Class");
	else if(p>35) System.out.println("Division = Pass Class");
	else System.out.println("Division = FAILED");
	}
	 
	 
 }