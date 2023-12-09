package q06;
/*
6. Write a java program to take three numbers from command line and print the average ?
>> java Avg 5 6 4
Average=5
*/

public class Avg{
	public static void main(String args[]){	
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int z=Integer.parseInt(args[2]);
	System.out.println("The Average= " + ( (x + y + z) / 3) );
	} 
} 