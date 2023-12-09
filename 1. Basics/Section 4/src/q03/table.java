package q03;
/*
3. Write a program in java to display the multiplication table of a given integer?
>> Enter the number : 5
5 X 1 = 5
5 X 2 = 10
.
.
5 X 10 = 50
*/

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number whose multiplication table is to be printed");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + n * i);
		}

	}
}