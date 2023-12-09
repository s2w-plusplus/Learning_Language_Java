package tester;


import com.app.core.Course;
import com.app.core.Student;
import custom_comparator.customOrderGPA;
import custom_exception.studentXception;

import static utils.CollectionUtils.populateSampleData;
import static utils.StudentValidation.*;
import static com.app.core.Student.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;

public class TestStudent {
	
	public static void main(String args[]) 
	{
		try(Scanner scan=new Scanner( System.in)) 
		{
			ArrayList<Student> Roll = populateSampleData();
			boolean Exit=false;
			
		while(!Exit) 
		{
			System.out.println("1. Add student Details");
			System.out.println("2. Fetch Student Details");
			System.out.println("3. Display all Student Details");
			System.out.println("4. Cancel Admission");
			System.out.println("5. Update GPA");
			System.out.println("6. Print names of students enrolled in a specific course , with DoB before a specific date");
			System.out.println("7. Sort by PRN(Natural Ordering)");
			System.out.println("8. Sort by GPA(Custom Ordering using seperate class)");
			System.out.println("9. Sort by Course & then Descending GPA (Custom Ordering using anonymous inner class )");
			System.out.println("10. Remove Failed Students from the List");
			System.out.println("11. Display details of the student in reverse order.");
			System.out.println("12. Exit");
			
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
							if(Roll.isEmpty()){
								System.out.println("The list is not yet populated");
								break;
								}
							System.out.println("Student Data..............................");
							for(Student s:Roll) 
								System.out.println(s);
							System.out.println(".................................................");
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
				case 6:			
							System.out.println("Enter the Course name");
							Course mycourse=convert2enum(scan.next());
							System.out.println("Enter the Date Of Birth");
							Date dob=sdf.parse(scan.next());
							for(Student S:Roll) 
								if(S.getElective()==mycourse && S.getDob().before(dob)) //use equals is optional here,enums are self type constants == works fine
									System.out.println(S);	
							break;
				case 7: 
							Collections.sort(Roll);
							System.out.println("Sorting Successful");
					        break;
				case 8:
							Collections.sort(Roll, new customOrderGPA());
							System.out.println("Sorting Successful");
							break;
				case 9:
							Collections.sort(Roll, new Comparator<Student>() { //use of anonymous inner class
								@Override
								public int compare(Student s1, Student s2) {
									int temp=s1.getElective().compareTo(s2.getElective()) ;
									if(temp==0) 
										return ( (Double)(s2.getGpa()) ).compareTo( s1.getGpa() ); //we want descending order so the switch
									return temp;	
									}
								});
							System.out.println("Sorting Successful");
							break;	
				case 10:    
							System.out.println("Removing  details of failed students from the list...");
							ListIterator<Student> studItr=Roll.listIterator();
							while(studItr.hasNext()) 
								if(studItr.next().getGpa() < 5.0) 
									studItr.remove();
							System.out.println("Failed Students has been removed successfully");
							break;
				case 11:		
							System.out.println("List in reverse Order............................");
							ListIterator<Student> studItr2=Roll.listIterator(Roll.size());
							while(studItr2.hasPrevious()) 
								System.out.println(studItr2.previous());
							System.out.println("..................................................");
							
				case 12:
							Exit=true;
							break;
				default:
							System.out.println("Invalid Choice Entered");
				}	
				
			}catch(studentXception x) {
				System.out.println(x);
			}catch(ParseException p) {
				System.out.println("Plz Enter Date in Valid Format");
				//p.printStackTrace();
			}catch(IndexOutOfBoundsException i) {
				System.out.println("No matches found in the list for this PRN");
				//	i.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
			scan.nextLine();
		}	
				
			
		}
		
	}
	
}
