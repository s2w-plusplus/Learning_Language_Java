package q15;
/*
15. Write a program to display the number in reverse order.
*/

import java.util.Scanner;

public class flipNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num = sc.nextInt();
		int revnum = 0;

		while (num != 0) {
			int lastdig = num % 10;
			revnum = revnum * 10 + lastdig;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: "+ revnum);

	}

}
