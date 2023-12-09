package q05;
/*
5. Write a program to concatenate two arrays (merge two array to new one)?
    a[] = {1,2,3}
	b[] = {4,5}
	c[] = {1,2,3,4,5}
*/


import java.util.Scanner;

public class concatArr {

	public static void main(String[] args) {

	//	Scanner sc = new Scanner(System.in);
		int[] a = { 2, 3 };
		int[] b = { 4, 5, 6 };
		int length = a.length + b.length;
		int[] joined = new int[length];
		int pos = 0;
		for (int c : a) {
			joined[pos] = c;
			pos++;
		}

		for (int d : b) {
			joined[pos] = d;
			pos++;
		}
		System.out.print("\nJoined array is...");
		for (int e : joined)
			System.out.print(" " + e);

	}

}
