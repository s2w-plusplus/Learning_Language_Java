package xtra.composite_primary;
import xtra.core.Department;

public class empPK {

	private int empID;
	private Department dept;
	public empPK(int empID, String dept) {
	
		this.empID = empID;
		this.dept = Department.valueOf(dept.toUpperCase());
	}
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	} 
	
	
	@Override
	public boolean equals(Object obj) {
		if (this.empID == ((empPK)obj).getEmpID() && this.dept==((empPK)obj).dept )
			return true;
		return false;	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + empID;
		return result;
	}
	
	
}
