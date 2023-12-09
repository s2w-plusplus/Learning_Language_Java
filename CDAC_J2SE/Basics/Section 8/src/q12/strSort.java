package q12;
/*
12. Write a program to Sort strings in alphabetical order?
*/

import java.util.Arrays;

class strSort {
	public static void main(String[] args) {

		
		String names[] = { "Saurabh", "Suhas", "Anita", "Vishwas","Vaibhav","Mangesh","shubham" };
		int size= names.length;
		Arrays.sort(names);

		System.out.println("Alphabetically arranged strings: ");
		for (int i = 0; i < size; i++) {
			System.out.println(names[i]);
		}
	}
}
