package q07;
/*
7. Write a java program to calculate compound interest, get the required inputs 
using Scanner ?
*/
import java.lang.Math;
import java.util.Scanner;
class CmpndInt{
	
	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("\nLet's Calculate Compound Interest..");
	System.out.println("Warning! This calculator does not consider cases where time(n years) is fractional.");
	System.out.println("Provide data in the following format:\n<Principal>\n<Rate(in %)>\n<No. of times the interest is compounded> ( Annually(1), Half-yearly(2),Quaterly-(4)..,Monthly(12))\n<Time in years>\n");
	
	int p=scan.nextInt();
	double r=scan.nextDouble();
	int c=scan.nextInt();
	int n=scan.nextInt();
	double Amount=( p*( Math.pow( ( 1+ (r/(100*c) ) ), (n*c) )) );
	System.out.println("\nThe Compound Interest is: "+ (Amount-p));

	}
}