package q14;
/*
14. Write a program to display the first n terms of Fibonacci series. 

Fibonacci series 0 1 2 3 5 8 13 .....
Test Data :
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34
*/


import java.util.Scanner;

public class fibbo{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms you want in the fibonacci series..");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1, n3, i;

		System.out.println("The" + n + " fibonaaci terms are");
		System.out.print(n1 + " " + n2);

		for (i = 2; i < n; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
