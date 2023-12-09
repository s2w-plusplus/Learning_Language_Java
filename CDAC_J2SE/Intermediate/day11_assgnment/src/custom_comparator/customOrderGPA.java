package custom_comparator;

import java.util.Comparator;

import com.app.core.Student;

public class customOrderGPA implements Comparator<Student>{
	
	
	@Override
	public int compare(Student s1, Student s2) {
	
		return ( (Double)(s1.getGpa()) ).compareTo( s2.getGpa() );
	}

}
