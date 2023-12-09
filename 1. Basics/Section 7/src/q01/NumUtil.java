/*
1. Write a java class named as NumUtil with following static methods: 
	double getPower(double x, int n)
 	long getFactorial(int num);
 	boolean isPrime(int num);
 	boolean isEven(int num);
 	boolean isOdd(int num);
 	
 1.1) Write test class named as NumUtilMain to test all these methods.
 1.2) Extends question 2.1 to make it menu driven, based on the user choice , read relevant data from user and call static methods
*/


package q01;

public class NumUtil 
{
	static double getPower(double x, int n) 
	{
	 double ans=1;	
	 for(int i=0;i<n;i++) {ans*=x; }
	 return(ans);
	}
	
	static long getFactorial(int num)
	{
	 long ans=1;	
	 for(int i=num;i>0;i--) {ans*=i;}
	 return(ans);	
		
	}
	static boolean isPrime(int num)
	{
	 boolean flag=true;
	 int i=2;
	 do {
		 if(num%i==0) flag=false;
		 i++;
	 	}while(flag==true && i<(num/2) );
	 return (flag);
	}
	
	static boolean isEven(int num) 
	{
	 boolean flag=true;
	 if((num%2)>0) flag=false;
	 return(flag);
	}
	
	static boolean isOdd(int num) 
	{
	 return (!isEven(num));	
	}
}
