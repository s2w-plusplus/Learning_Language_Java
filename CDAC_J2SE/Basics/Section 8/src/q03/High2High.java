package q03;
/*
3. Write a program to find out highest and second highest number in an array?
*/

import java.util.Arrays;
import java.util.Scanner;

public class High2High {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements ");
		int x[] = new int[5];
		for (int i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		System.out.println(x[x.length - 1] + " is the largest number");
		System.out.println(x[x.length - 2] + " is the second largest number");
	}

}
