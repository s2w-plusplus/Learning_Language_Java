package q08;

import java.util.Scanner;

public class findDupli{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int c = 0, i, j, temp = 0;

		System.out.println("Enter the numbers");
		for (i = 0; i < 5; i++) 
		{
		arr[i] = sc.nextInt();
		}

		for (i = 0; i < 5; i++) 
		{
			for (j = i + 1; j < 5; j++) 
			{
			if (arr[i] == arr[j])
			System.out.println(arr[j] + " is a repeated value");
			}
		}

		sc.close();

	}
}
