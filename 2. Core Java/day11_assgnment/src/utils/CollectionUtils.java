package utils;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.core.Student;

import static com.app.core.Course.*;
import static com.app.core.Student.sdf;


public class CollectionUtils {

	public static ArrayList<Student> populateSampleData() {
		ArrayList<Student> list = new ArrayList<>();
		try {

			list.add(new Student("12001273E","Saurabh","saurabh@gmail.com","mypassword1",REACT,9.9,sdf.parse( "12-3-2007" )));
			list.add(new Student("14501273E","Shubham","shubham@gmail.com","mypassword2",ANGULAR,6.9,sdf.parse( "1-3-2002" )));
			list.add(new Student("17701273E","Tanmay","tanmay@gmail.com","mypassword3",REST,4.9,sdf.parse( "12-7-1998" )));
			list.add(new Student("56001273E","Nikhil","nikhil@gmail.com","mypassword4",DBT,3.9,sdf.parse( "22-4-2013" )));
			list.add(new Student("10001273E","Nayan","nayan@gmail.com","mypassword5",SPRING,10,sdf.parse( "17-11-2010" )));
			list.add(new Student("12001893E","Kunal","kunal@gmail.com","mypassword6",HIBERNATE,9.7,sdf.parse( "1-1-2021" )));
			
		} catch (ParseException e) {
			System.out.println("err in sample data " + e);
		}
		return list;
	}

}
