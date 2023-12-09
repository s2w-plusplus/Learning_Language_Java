package Q3.com.tester;

import java.util.Scanner;

import Q3.com.top.Apple;
import Q3.com.top.Fruits;
import Q3.com.top.Mango;
import Q3.com.top.Orange;

public class FruitBasket 
{
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many fruits can the basket hold?");
		Fruits[] basket=new Fruits[scan.nextInt()];
		
		int count=-1;
		boolean exit=false;
		while(!exit) 
		{
			System.out.println("What do you want to do?");
			System.out.println("1.Add an Apple in the Basket.");
			System.out.println("2.Add a Mango  in the Basket.");
			System.out.println("3.Add an Orange in the Basket");
			System.out.println("4.Just see basket's contents...");
			System.out.println("5. I am done...");
			
			switch(scan.nextInt()) 
			{
			case 1:
						 if(count < basket.length-1 )
						   {
							 System.out.println("What kind of apples?");
						     basket[++count]=new Apple(scan.next());
						     System.out.println(basket[count].toString());
						   }
						 else
						    System.out.println("The Basket is Full.");
						 break;
			case 2:
						if(count < basket.length-1 )
							{
							System.out.println("What kind of mangoes?");
							basket[++count]=new Mango(scan.next());
							System.out.println(basket[count].toString());
							}
						else
							System.out.println("The Basket is Full.");
						break;
			case 3:
						if(count < basket.length-1 )
							{
							System.out.println("What kind of oranges?");
							basket[++count]=new Orange(scan.next());
							System.out.println(basket[count].toString());
							}
						else
							System.out.println("The Basket is Full.");
						break;
			case 4:
						int fcount=0;
						if(count==-1) 
							System.out.println("The basket is empty");
						else
							for(Fruits F: basket)
								 if(F!=null)
									 System.out.println( (++fcount)+": "+F.getFName()+" tastes "+F.taste());
						break;
			case 5:
						exit=true;
						break;
			default:
						System.out.println("Invalid choice!Try Again..");
			}
			
		
	  }
	 scan.close();	
  }
}
