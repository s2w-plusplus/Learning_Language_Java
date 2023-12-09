package q11;
/*
11. Write a program to Sort an array in ascending order? [Notes : Arrays.sort()]
*/

import java.util.Arrays;

class arrSort {
	public static void main(String[] args) {

		
		int numbers[] = { 2,56,23,9,1313,1,-6,-45,0 };
		int size= numbers.length;
		Arrays.sort(numbers);

		System.out.println("Array in ascending order: ");
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
	}
}
