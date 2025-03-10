package Q3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Student {
	
		private  int Id;
		private String name;
		private int age;
		private LinkedHashSet<String> courseSet;
		
		
		public Student(String name,int age){
			this.name = name;
			this.age = age;
			this.courseSet=new LinkedHashSet<String>();
		}
		
		public String getName() {
			return name;
		}

		public boolean enroll(Course course) {
			if(course.getRegDate().isBefore(LocalDate.now())) {
				System.out.println("Registration has been closed");
				return false;
			}else if(!courseSet.add(course.name())){
				System.out.println("The Student is already enrolled in the course");
				return false;
			}else
				Course.valueOf(course.name()).getStudentAttendance().add(this);
				return true;
		}
		
		
}
