package q08;
/*
8. Write a java program to convert temperature from celsius to fahrenheit, get input from command line ?
	Hint : F = (9*C/5) + 32
*/

class ClstoFhrnht{
	
	public static void main(String args[]){
		
	double clsius=Double.parseDouble(args[0]);	
	System.out.println("Fahrenheit conversion of given celsius value is: "+ ((9*clsius/5)+32)+" Deg F" );      
	}
	
	
}