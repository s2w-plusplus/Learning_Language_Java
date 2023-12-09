package q18;
/*
18. Write a Java program to check if character entered by user is a vowel, consonant or other character?
*/

import java.util.Scanner;

public class Vowel{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Unicode Character");
		char c = sc.next().charAt(0);
		
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.println("The entered Character is a vowel");
		else if (c >= 65 && c <= 90)
			System.out.println("The entered Character is a Consonant");
		else if (c >= 97 & c <= 122)
			System.out.println("The entered Character is a Consonant");
		else
			System.out.println("The entered Character is other than vowel or consonants");
		
	}

}
