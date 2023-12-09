package q03;
/*
3. Write a java program to calculate simple interest, get the required inputs 
from Scanner ?
Hint :  SI = (principal * rate * years)/100
 */  

import java.util.Scanner;
class SIbyScanner{
	
	public static void main(String args[]){
		System.out.println("Let's calculate the Simple Interest...");
		System.out.println("Enter the details in given format: (<PRINCIPAL> <RATE(in%)> <YEARS> ) ");       
		Scanner scan=new Scanner(System.in);
		int P=scan.nextInt();
		double R=scan.nextDouble();
		int Y=scan.nextInt();
		
		double SI=(P*R*Y)/100;			
		System.out.println("The Simple Interest is: "+ SI );        
	}
	
	
}
