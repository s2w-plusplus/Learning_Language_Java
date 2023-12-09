package q06;
/*
6. Write a Java program to test if an array contains a specific value?
*/

import java.util.Scanner;

public class ifArrContain {

	public static void main(String[] args) {
	
	int[] Arr = {45,67,35,98,2,12,36,31,78,99,27,76,88,63,5};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("We have a predefined array, Check if that array contains a specific value");
	int value = sc.nextInt();
	boolean flag=false;
	for (int x : Arr) 
		{
		if (value==x) 
			{
			flag=true;	
			System.out.println("The Array do contain the typed value");
			break;
			}
		}	
	if(flag==false)
		System.out.println("SORRY! The Array does not contain the typed value");
	
	sc.close();
	}		
}