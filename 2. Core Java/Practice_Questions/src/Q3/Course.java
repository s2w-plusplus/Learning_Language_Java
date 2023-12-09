package Q3;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import static java.time.LocalDate.of;
public enum Course {

	EDAC(of(2021,12,29)),EDBDA(of(2022,2,19)),EDAI(of(2022,1,9)),
	EDESD(of(2022,2,26)),EDMC(of(2021,11,30)),EDITISS(of(2022,3,15));
	
	private LocalDate regDate;
	private TreeSet<Student> studentAttendance; 
	
	private Course(LocalDate regDate) {
		this.regDate = regDate;
		this.studentAttendance=new TreeSet<Student>((s1,s2) -> s1.getName().compareTo(s2.getName()));
	}

	public Set<Student> getStudentAttendance() {
		return studentAttendance;
	}

	public LocalDate getRegDate() {
		return regDate;
	}
	
	
}
