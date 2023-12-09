package utils;

import java.util.ArrayList;

import com.app.core.Course;
import com.app.core.Student;

import custom_exception.studentXception;

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
		else
			throw new studentXception("The Entered PRN is Already Assigned");
	
	}
	
	
}
