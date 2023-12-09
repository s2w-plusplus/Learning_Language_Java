package q09;
/*
9. Write a program to make such a pattern like a pyramid with an asterisk, as show below : 
   * 
  * * 
 * * * 
* * * *
*/


public class asterisk2 {

	public static void main(String[] args) {
		

		for (int i = 0; i < 4; i++) {
			for (int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
