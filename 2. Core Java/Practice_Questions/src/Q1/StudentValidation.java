package Q1;

import java.util.HashSet;

public class StudentValidation {

	public static Student getStudentById(String Id,HashSet<Student> students){
		for(Student s : students)
			if(s.getId().equals(Id))
				return s;
		return null;
	}
}
