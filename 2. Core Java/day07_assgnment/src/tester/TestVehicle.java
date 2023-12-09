package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle {
	
	public static void main(String[] args) 
	{
		try(Scanner scan=new Scanner(System.in))
		{
			System.out.println("Enter first Vehicle details");
			Vehicle V1=new Vehicle(scan.next(),scan.next(),scan.nextDouble());
			System.out.println("Enter second Vehicle details");
			Vehicle V2=new Vehicle(scan.next(),scan.next(),scan.nextDouble());
			System.out.println(V1.equals(V2)?"Same":"Different");				
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	
	}
	

}
