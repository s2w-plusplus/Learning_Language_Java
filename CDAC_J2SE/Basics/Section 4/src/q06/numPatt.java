package q06;
/*
6. Write a program to display the pattern like right angle triangle with a number as shown below : 
1
12
123
1234
*/
public class numPatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}

	}

}
