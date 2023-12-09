package q15;
/*
15. Write a java program to check if a given number is divisble by 3 and 5 ? 
*/
import java.util.Scanner;
 class Test3n5{
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int x=scan.nextInt();
	
	if(((x%3)==0)&&((x%5)==0)) System.out.println(x+" is divisible by 3 as well as 5");
	else if(((x%3)==0)) System.out.println(x+" is divisible by 3 but not by 5");
	else if(((x%5)==0)) System.out.println(x+" is divisible by 5 but not by 3");
	else System.out.println(x+" is not divisible by either of them");
	}
	 
	 
 }