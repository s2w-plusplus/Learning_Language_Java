package Q1;

public class Student {

	private String id;
	private String email;
	private long  Mb_no;
	private Course course;
	private double marks;

	public Student(String id, String email, long mb_no, Course course, double marks) {
		super();
		this.id = id;
		this.email = email;
		Mb_no = mb_no;
		this.course = course;
		this.marks = marks;
	}

	public void setMb_no(long mb_no) {
		Mb_no = mb_no;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getId() {
		return id;
	}

	public Course getCourse() {
		return course;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", email=" + email + ", Mb_no=" + Mb_no + ", course=" + course + ", marks=" + marks
				+ "]";
	}
	
	

	@Override
	public int hashCode() {
		return email.hashCode();
	}


}
