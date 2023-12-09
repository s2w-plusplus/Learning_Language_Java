package q08;
//8. Write a program to get the largest element of an array using recursion?

import java.util.Scanner;
public class recurrArrMax 
{

	static int arr[] = new int[5];

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
	

		System.out.println("Enter the array of 5 elements");
		for (int i = 0; i < 5; i++) 
			arr[i] = sc.nextInt();
		
		int ans=recurrAmax(arr,arr.length-1);
		System.out.println("Largest element of the array is " + ans);
	}

	static int recurrAmax( int[] arr, int index) 
	{
		if (index>0) 
			{
			return Math.max(arr[index], recurrAmax(arr, index-1));
			} 
		else 
			{
			return arr[0];
			}
	}

}
