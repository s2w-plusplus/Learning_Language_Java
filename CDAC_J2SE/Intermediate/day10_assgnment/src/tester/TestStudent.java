package tester;

import com.app.core.Student;
import custom_exception.studentXception;

import static utils.StudentValidation.*;
import static com.app.core.Student.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	
	public static void main(String args[]) 
	{
		try(Scanner scan=new Scanner(System.in)) 
		{
			ArrayList<Student> Roll= new ArrayList<>();
			boolean Exit=false;
			
		while(!Exit) 
		{
			System.out.println("1. Add student Details");
			System.out.println("2. Fetch Student Details");
			System.out.println("3. Display all Student Details");
			System.out.println("4. Cancel Admission");
			System.out.println("5. Update GPA");
			System.out.println("100. Exit");
			
			try 
			{
				switch( scan.nextInt() )
					{
				case 1: 
							System.out.println("Enter The Student details in the following format:");
							System.out.println("<PRN><Name><Email><Password><Course><GPA><DOB>");
							Roll.add(new Student( addCheck(Roll,scan.next()),scan.next(),scan.next(),scan.next()
									,convert2enum(scan.next()),scan.nextDouble(),sdf.parse( scan.next() ) ));
							System.out.println("Student has been successfully added!");
							break;
				case 2: 
						   System.out.println("Enter the PRN whose details needs to be fetched..");
						   Student dummy=new Student(scan.next());
						   System.out.println(Roll.get(Roll.indexOf(dummy)) );
							break;
				case 3: 
							if(Roll.isEmpty())
								{
								System.out.println("The list is not yet populated");
								break;
								}
							System.out.println("-------Student Data------");
							for(Student s:Roll) 						
									System.out.println(s);
							break;
				case 4: 	
							System.out.println("Enter the Student PRN");
							int index = Roll.indexOf(new Student(scan.next()));
							if (index == -1)
								throw new studentXception("PRN does not exist");
							Roll.remove(index);
							System.out.println("Student has been successfully removed!");
							break;
				case 5: 
							System.out.println("Enter the student PRN");
							index = Roll.indexOf(new Student(scan.next()));
							if (index == -1)
								throw new studentXception("PRN does not exist");
							System.out.println("Enter GPA ");
							Roll.get(index).setGpa(scan.nextDouble());
							System.out.println("GPA Updated successfully");
							
							break;
				case 100: 
							break;
				}	
				
			}catch(studentXception x) {
				System.out.println(x.getMessage());
			}catch(ParseException p) {
				System.out.println("Plz Enter Date in Valid Format");
			}catch(IndexOutOfBoundsException i) {
				System.out.println("No matches found in the list for this PRN");
			}catch(Exception e) {
				e.printStackTrace();
			}
			scan.nextLine();
		}	
			
			
			
			
		}
		
	}
	
}
