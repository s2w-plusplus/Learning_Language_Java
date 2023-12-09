package tester;

import static utils.ValidationRules.validateSpeed;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		//only the resources implementing autocloseable interface can be instantiated in try header
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try....");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}//sc,close() implicit
		System.out.println("main over....");

	}

}
