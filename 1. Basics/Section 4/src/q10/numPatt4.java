package q10;
/*
10. Write a program to make such a pattern like a pyramid with a number which will repeat the number in the same row as shown below : 
   1
  2 2
 3 3 3
4 4 4 4
*/

public class numPatt4 {

	public static void main(String[] args) {
		

		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

	}

}
