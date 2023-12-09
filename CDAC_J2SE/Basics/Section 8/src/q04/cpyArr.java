package q04;
/*
4. Write a Java program to copy an array to another by iterating the array?
*/

import java.util.Scanner;

public class cpyArr {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("How long do you want your array");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int i;
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (i = 0; i < n; i++)
			b[i] = a[i];

		System.out.println("The first array was ");
		for (i = 0; i < n; i++)
			System.out.print(a[i]);

		System.out.println("\nThe new array  is  ");
		for (i = 0; i < n; i++)
			System.out.print(b[i]);
	}

}
