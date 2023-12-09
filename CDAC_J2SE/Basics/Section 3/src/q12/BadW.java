package q12;
/*
12. Write a java program to read temperature in centigrade and display a suitable message according to temperature state below :
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot

Test Data :
42
Expected Output :
Its very hot.
*/
import java.util.Scanner;
 class BadW{
	 
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Temperature in degree centigrade: ");
	int T=scan.nextInt();

	if(T<0) System.out.println("Freezing weather");	
	else if(T<10) System.out.println("Very Cold weather");
	else if(T<20) System.out.println("Cold weather");	
	else if(T<30) System.out.println("Normal in Temp");
	else if(T<40) System.out.println("Its Hot");
	else System.out.println("Its Very Hot");
	}
	 
	 
 }