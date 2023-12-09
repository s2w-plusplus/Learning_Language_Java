package q07;
/*
7. Write a Java program to find the index of an array element?
*/

import java.util.Scanner;

public class findIndex{

	public static void main(String[] args) {
	
	int[] Arr = {45,67,35,98,2,12,36,31,78,99,27,76,5,38,19};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("We have a predefined array, Check if that array contains a specific value and return its position");
	int value = sc.nextInt();
	boolean flag=false;
	for (int i=0;i<15;i++) 
		{
		if (value==Arr[i]) 
			{
			flag=true;	
			System.out.println("The Array do contain the typed value at position "+(i+1));
			break;
			}
		}	
	if(flag==false)
		System.out.println("SORRY! The Array does not contain the typed value");
	
	sc.close();
	}		
}