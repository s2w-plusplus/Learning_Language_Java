package Q2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	public static SimpleDateFormat sdf; 
	static{
		 sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	private String id;
	private String name;
	private Date dob;
	private Date hireDate;
	private Double salary;
	private Department dept;
	
	
	public Employee(String id, String name, Date dob, Date hireDate, Double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.hireDate = hireDate;
		this.salary = salary;
		this.dept = Department.valueOf(department);
	}

	public Date getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", hireDate=" + hireDate + ", salary="
				+ salary + ", department=" + dept + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
