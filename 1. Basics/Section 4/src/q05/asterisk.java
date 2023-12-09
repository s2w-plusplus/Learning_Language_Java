package q05;
/*
5. Write a program to display the pattern like right angle triangle using an asterisk as shown below:
*
**
***
****
*/

public class asterisk{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
