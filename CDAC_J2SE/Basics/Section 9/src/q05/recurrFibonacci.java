package q05;
/*
5. Write a recursive program to print Fibonacci Series for given number of terms?

 Input number of terms for the Series (< 20) : 10                                
 The Series are :                                                                
 0  1  1  2  3  5  8  13  21  34  55 
*/

import java.util.Scanner;

public class recurrFibonacci 
{
	
  public static void main(String args[]) 
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("Input number of terms for the Series (< 20) :");
	int maxNumber = scan.nextInt();
	System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
	
	for(int i = 0; i < maxNumber; i++)
		{
		System.out.print(fibonacciRecursion(i) +" ");
		}
  }
	
 static int fibonacciRecursion(int n)
    {
	if(n == 0)
		{
		return 0;
		}
	else if(n == 1 || n == 2)
		{
		return 1;
		}
	else return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
  
}

