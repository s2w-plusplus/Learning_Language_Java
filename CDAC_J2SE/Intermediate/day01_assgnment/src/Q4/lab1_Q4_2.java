package Q4;
import java.util.Scanner;

public class lab1_Q4_2 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        
       
      
        int ch, tot=0;
        int total[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean flag[] = { false, false, false, false, false, false, false, false, false };
        int Quantity[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int Price[] = { 50, 45, 30, 10, 35, 30, 60, 25, 55};
        String items[] = {"Dosa","Utappa","Poha Jalebi","Vada Pav","Dhokla","Appam","Vada Sambhar","Idli Chutney","Aloo Paratha" };
            
        for(;;) 
        {
            System.out.println("*******Food Menu*******");
            System.out.println("1.Dosa          (Rs. 50)");
            System.out.println("2.Utappa        (Rs. 45)");
            System.out.println("3.Poha Jalebi   (Rs. 30)");
            System.out.println("4.Vada Pav      (Rs. 10)");
            System.out.println("5.Dhokla        (Rs. 35)");
            System.out.println("6.Appam         (Rs. 30)");
            System.out.println("7.Vada Sambhar  (Rs. 60)");
            System.out.println("8.Idli Chutney  (Rs. 25)");
            System.out.println("9.Aloo Paratha  (Rs. 55) ");
            System.out.println("10. Generate Bill & Exit");

            System.out.println("Enter your choice");
            ch = sc.nextInt();
            if( (ch<10) && (ch>0) )
                {
                System.out.println("Enter Quantity");
                Quantity[ch-1]+= sc.nextInt();
                flag[ch-1]=true;
                }
            else if(ch==10)
                {
                 break;   
                } 
            else  
                {
                 System.out.println("You have entered an INVALID CHOICE!\nPlease Try Again...");
                 continue;
                }      
        }

        sc.close();
               
        
        System.out.println("********************BILL********************");
        System.out.println("Item               Quantity            Price              Total \n");
   
        for(int i=0;i<9;i++)
        {
             if (flag[i] == true) 
                {
                 total[i] = Quantity[i] * Price[i] ;
                 tot+=total[i];
                 System.out.printf("%-17s %-13d %-13d %10d \n",items[i] , Quantity[i] , Price[i] , total[i] );
                }
        }         
         System.out.println("\n" + "------------------------------------------");
         System.out.println("Total = \n" + tot);
    }
    

    
}

