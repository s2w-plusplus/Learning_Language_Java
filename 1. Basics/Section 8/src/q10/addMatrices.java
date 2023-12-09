package q10;
/*
10. Write a program to add two matrix of numbers?
*/

import java.util.Scanner;
class addMatrices {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
 
    System.out.println("Input number of rows of matrix");
    int x = scan.nextInt();
    System.out.println("Input number of columns of matrix");
    int y  = scan.nextInt();
		
	int A[][] = new int[x][y];
    int B[][] = new int[x][y];
    int C[][] = new int[x][y];
	
	System.out.println("Please fill the first matrix");
	for (int  row = 0 ; row < x ; row++ )
         for (int col = 0 ; col < y ; col++ )
            A[row][col] = scan.nextInt();
	
	System.out.println("Please fill the second matrix");
	for (int  row = 0 ; row < x ; row++ )
         for (int col = 0 ; col < y ; col++ )
            B[row][col] = scan.nextInt();
	
	
	System.out.println("Sum of these 2 matrices");
	 for (int row = 0 ; row < x ; row++ )
	 {
         for (int col = 0 ; col < y ; col++ )
		 {
             C[row][col] = A[row][col] + B[row][col];
			 System.out.print(C[row][col]+"\t");			 
		 }	
		 System.out.print("\n");
	 }	 
  
  
  }
}
