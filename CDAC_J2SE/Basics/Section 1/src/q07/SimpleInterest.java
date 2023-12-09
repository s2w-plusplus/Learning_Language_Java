package q07;
/*
7. Write a java program to calculate simple interest, get the required inputs from command line ?
   Hint : SimpleInterest = (principal * rate * years)/100.0
*/

public class SimpleInterest{
	public static void main(String args[]){
	
    System.out.println("\nI hope you have entered CommandLine Arguments in format: ( java SimpleInterest <PRINCIPAL> <RATE(in%)> <YEARS> )  ");
    
    int P=Integer.parseInt(args[0]);      	
	double r=Double.parseDouble(args[1]);
	int y=Integer.parseInt(args[2]);	
	System.out.println("The Simple Interest is: "+ (P*(r/100)*y));
	
	}
	
	
}

