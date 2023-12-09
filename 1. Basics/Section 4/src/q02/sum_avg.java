package q02;
/*
2. Write a java program to read 10 numbers from keyboard and find their  sum and average?
*/

import java.util.Scanner;

public class sum_avg{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int a[] = new int[10];
		double sum = 0;

		System.out.println("Enter ten numbers");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		double avg = sum / 10.0;
		System.out.println("The sum is " + sum);
		System.out.println("The avg is " + avg);
		sc.close();

	}

}
