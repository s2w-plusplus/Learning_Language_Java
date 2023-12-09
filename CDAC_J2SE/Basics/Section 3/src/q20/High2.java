package q20;
/*
20. Write a program to read 5 numbers from user, print the second highest number?
*/

import java.util.Scanner;

public class High2 {
	
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);	
		 
		 int[] arr=new int[5];
		 System.out.println("Enter the 5 numbers"); 
	     for(int k=0;k<5;k++) {arr[k]=scan.nextInt();}
	     
	     int secmax=0;
	     for(int i=0,max=arr[0];i<5;i++) 
	     {
	      if(arr[i]>max) 
	      	{
	    	  secmax=max;
	    	  max=arr[i];
	    	  
	      	}
	      else if(arr[i]<max && arr[i]>secmax) {secmax=arr[i];}
	      else continue;
	     }
		
	     System.out.println("The second highest element of the given numbers is: "+secmax);
		
	}

}
