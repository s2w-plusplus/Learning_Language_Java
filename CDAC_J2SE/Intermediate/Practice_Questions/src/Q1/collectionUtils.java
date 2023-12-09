package Q1;

import java.util.HashSet;

public class collectionUtils {
	
	static HashSet<Student> populateSet(){

		HashSet<Student> students = new HashSet<>();
		students.add(new Student("A1","A1@gmail.com",9876543210L,Course.EDAC,98.76));
		students.add(new Student("A2","A2@gmail.com",9876543211L,Course.EDAI,76.12));
		students.add(new Student("A3","A3@gmail.com",9876543212L,Course.EDBDA,84.36));
		students.add(new Student("A4","A4@gmail.com",9876543213L,Course.EDESD,54.60));
		students.add(new Student("A5","A5@gmail.com",9876543214L,Course.EDITISS,61.91));
		students.add(new Student("A6","A6@gmail.com",9876543215L,Course.EDMC,41.11));
		
		return students;
		
	}
	
	
       
}
