package Q4;
import java.util.Scanner;
class lab1_Q4_1{
    public static void main(String[] args) 
    {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the two double values");
     if(scan.hasNextDouble() && scan.hasNextDouble() )
             {
               double A=scan.nextDouble();
               double B=scan.nextDouble();
               avg(A, B);    
             }   
     else
              {
               System.out.println("Something is wrong with the value(s) you entered!"); 
              }    
    scan.close();
    }

    private static void avg(double A, double B)
    {
        System.out.println("The average of two numbers entered is: "+ (A+B)/2 );
    }

 }