package q08;
/*
8. Write a java program to read roll no, name and marks of three subjects and calculate the total and percentage. 

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
*/

import java.util.Scanner;
 class StdtPrcntg{
	 
	public static void main(String args[]){
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Input the Roll Number of the student: ");
	int R=scan.nextInt();
	System.out.println("Input the Name of the Student : ");
	String nm=scan.next();
	System.out.println("Input the marks of Physics, Chemistry and Computer Application: ");
	int p=scan.nextInt();
	int c=scan.nextInt();
	int ca=scan.nextInt();
	System.out.println("\nTotal Marks = "+ (p+c+ca));
	System.out.println("Percentage = "+ ((p+c+ca)/3)+" %");	
	}
	 
	 
 }