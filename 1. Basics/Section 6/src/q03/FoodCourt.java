package q03;
/*
3. Write a menu driven billing system for a Snacks center, items available are Tea(Rs. 10), Samosa (Rs. 20), Sandwitch(Rs. 50), Green Tea (Rs. 15) etc. as follows - 

****Welcome to Snack Center *********
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 1
   Enter quantity : 2
   
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 3
  Enter quantity : 3
  
1. Tea (Rs. 10)
2. Green Tea (Rs. 15)
3. Samosa (Rs. 20)
4. Sandwitch (Rs. 50)
5. Generate Bill & Exit
Enter your choice : 5

 *****BILL****
 Tea    2    20
 Samosa 3    60
 ------------
 Total = 80

*/

import java.util.Scanner;

public class FoodCourt {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("****Welcome to Snack Center****");
		int t = 0, gt = 0, sam = 0, sand = 0;
		int ch, tot;
		int total[] = { 0, 0, 0, 0 };
		int flag[] = { 0, 0, 0, 0 };
		int Quantity[] = { 0, 0, 0, 0 };
		do {
			System.out.println("1. Tea (Rs. 10)");
			System.out.println("2. Green Tea (Rs. 15)");
			System.out.println("3. Samosa (Rs. 20)");
			System.out.println("4. Sandwich (Rs. 50)");
			System.out.println("5. Generate Bill & Exit");

			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter Quantity");
				Quantity[0]+= sc.nextInt();
				flag[0]=1;
				break;
			case 2:
				System.out.println("Enter Quantity");
				Quantity[1]+= sc.nextInt();
				flag[1]=1;
				break;
			case 3:
				System.out.println("Enter Quantity");
				Quantity[2]+= sc.nextInt();
				flag[2]=1;
				break;
			case 4:
				System.out.println("Enter Quantity");
				Quantity[3]+= sc.nextInt();
				flag[3]=1;
				break;
			case 5:
				System.out.println("*****BILL****");
				System.out.println("item         quantity             rate");
				if (flag[0] == 1) {
					System.out.print("\n" + "Tea          ");
					System.out.print(Quantity[0] + "                  " + Quantity[0] * 10);
					flag[0] = 0;
					total[0] = Quantity[0] * 10;

				}
				if (flag[1] == 1) {
					System.out.print("\n" + "GrnTea          ");
					System.out.print(Quantity[1] + "                  " + Quantity[1] * 15);
					flag[1] = 0;
					total[1] = Quantity[1] * 15;
				}
				if (flag[2] == 1) {
					System.out.print("\n" + "Samosa          ");
					System.out.print(Quantity[2] + "                  " + Quantity[2] * 20);
					flag[2] = 0;
					total[2] = Quantity[2] * 20;
				}
				if (flag[3] == 1) {
					System.out.print("\n" + "Sandwich          ");
					System.out.print(Quantity[3] + "                  " + Quantity[3] * 50);
					flag[3] = 0;
					total[3] = Quantity[3] * 50;
				}

				tot = total[0] + total[1] + total[2] + total[3];
				System.out.println("\n" + "------------------------------------------");
				System.out.println("Total = " + tot);
				total[0] = 0;
				total[1] = 0;
				total[2] = 0;
				total[3] = 0;
			}

		} while (ch != 5);

	}

}
