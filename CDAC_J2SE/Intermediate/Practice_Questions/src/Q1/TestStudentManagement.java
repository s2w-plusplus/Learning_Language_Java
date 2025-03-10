package Q1;

import java.util.HashSet;
import java.util.Scanner;

/*
1. Create java  application  for student management.
   Populate student details in a suitable data structure

-> Display All students by the specified course name
	I/P -- course name
	O/P -- List of students from the specified course (Use lambda expression or method reference for display)

-> Update Student details (update marks & phone number)
	I/P -- id , new marks & new phone number.
	O/P -- If student by specified id doesn't exist , throw custom exception (Student not found exception)
		-- Otherwise  values should be updated in a collection & give updations successful message.

-> Cancel Student admission.
	I/P -- email
	O/P -- If student by specified email doesn't exist , throw custom exception (Student not found exception)
		-- Otherwise  student record should be deleted .
 */
public class TestStudentManagement {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			HashSet<Student> students = collectionUtils.populateSet();
			boolean exit=false;
			System.out.println("***************Student Management System*************");
			
			do{
			
				System.out.println("1. Display students enrolled in a particular course");
				System.out.println("2. Update student details");
				System.out.println("3. Cancel student admission");
				System.out.println("4. Exit");

				try{
					
					switch(scan.nextInt()) {
						case 1:
									System.out.println("Please Enter Course Name...");
									Course course = Course.valueOf(scan.next().toUpperCase());
									students.stream()
													.filter(s -> s.getCourse().equals(course))
													.forEach(System.out::println);
									break;
						case 2:
									System.out.println("Enter the id of the student whose details you want to edit...");
									Student exist = StudentValidation.getStudentById(scan.next(),students);
									if(exist != null) {
										System.out.println("Please enter the marks and the phone number to be updated.....");
										exist.setMarks(scan.nextDouble());
										exist.setMb_no(scan.nextLong());
										System.out.println("Updation Successfull");
									}
									else 
										throw new CustomXception("This Id does not exist!");
									break;
						case 3:
									System.out.println("Enter the email of the student whose admission needs to be cancelled...");
									String email = scan.next();
									boolean cancelled = students.removeIf( s -> s.getEmail().equals(email));
									if(cancelled)
										System.out.println("Admission Cancelled!");
									else 
										throw new CustomXception("This Email does not exist!");
									break;
						case 4:
								exit=true;
								break;
					default:
								System.out.println("Invalid Choice! Please Try Again...");
					}
					
				}catch(IllegalArgumentException x) {
					System.out.println("Invalid Course Name! Try Again....");
				}catch(CustomXception cx) {
					System.out.println(cx.getMessage());
				}
				scan.nextLine();
			}while(!exit);
		}
	}
}
