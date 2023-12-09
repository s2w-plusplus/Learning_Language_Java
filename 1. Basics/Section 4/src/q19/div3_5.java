package q19;
/*
19. Write a program to print all numbers between 1 & 100 which are divisible by 3 and 5 both?
*/
public class div3_5{

	public static void main(String[] args) {
		

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i);
		}

	}

}
