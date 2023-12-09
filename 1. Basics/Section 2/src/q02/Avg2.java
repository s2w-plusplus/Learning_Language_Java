package q02;
/*
2. Write a java program to take 5 numbers using Scanner and print the average ?

>> Enter 5 numbers : 1 2 3 4 5
Average = 3

>> Enter 5 numbers : 2 3 5 7 9
Average = 5.2
*/
import java.util.Scanner;
class Avg2{
	
	public static void main(String args[]){
		
		System.out.println("Enter the 5 numbers to be averaged:- ");        
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		int avg=(a+b+c+d+e)/5;			
		System.out.println("The average of given numbers is:- "+ avg );        

		
		
	}
	
	
}
