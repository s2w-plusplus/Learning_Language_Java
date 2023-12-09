package q08;
/*
8. Write a program to make such a pattern like right angle triangle with number increased by 1 as shown below : 
1
2 3
4 5 6
7 8 9 10
*/

public class numPatt3 {

	public static void main(String[] args) {

		int i, j, k = 1;

		for (i = 1; i <= 4; i++) {

			for (j = 1; j < i + 1; j++) {

				System.out.print(k++ + " ");
			}

			System.out.println();
		}

	}

}
