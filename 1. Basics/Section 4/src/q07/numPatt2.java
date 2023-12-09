package q07;
/*
7. Write a program to make such a pattern like right angle triangle with a number which will repeat a number in a row, as shown below : 
1
22
333
4444
*/

public class numPatt2 {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) { // loop for value

			for (int j = 1; j <= i; j++) { // loop for repetition
				System.out.print(i);
			}

			System.out.println();
		}

	}

}
