package Q4.utils;

import java.util.ArrayList;

import Q4.com.app.core.Course;
import Q4.com.app.core.Student;
import Q4.custom_exception.studentXception;

public class StudentValidation 
{
	
	public static Course convert2enum(String course)
	{
		return Course.valueOf(course.toUpperCase() );
	}
 
	public static boolean doesPRNexist(ArrayList<Student> Roll ,String prn) 
	{
		Student dummy=new Student(prn);	
		if( Roll.contains(dummy) ) 
			return true;
		else return false;
	}
	
	public static String addCheck(ArrayList<Student> Roll ,String prn)  throws studentXception
	{
		if(!doesPRNexist(Roll , prn) )
		   return prn;
		throw new studentXception("The Entered PRN is Already Assigned");
	}
	
	
}
