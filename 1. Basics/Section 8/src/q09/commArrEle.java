package q09;
/*
9. Write a Java program to find the common elements between two arrays of integers?
*/

import java.util.Scanner;
import java.util.Arrays; 
public class commArrEle 
{

public static void main(String[] args) 
    {
      int[] array1 = {1, 6, 5, 1, 8, 9, 7, 10};
      int[] array2 = {1, 0, 6, 5, 6, 4, 7, 10};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                }
            }
        }
 
    }
}

/*
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[5];
		int[] arr2 = new int[5];

		System.out.println("Enter the 5 numbers for array 1");
		for (int i = 0; i < 5; i++)
			arr1[i] = sc.nextInt();

		System.out.println("Enter the 5 numbers for array 2");
		for (int i = 0; i < 5; i++)
			arr2[i] = sc.nextInt();

		
				
	}
}
*/