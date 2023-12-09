package Q2.com.app.org;

public abstract class Emp 
{ 
	private int id;
	private String name ;
	private double basic_sal;
	private String deptId;
	

	public Emp(int id, String name, double  basic_sal, String deptId) 
	{
		this.id = id;
		this.name = name;
		this.basic_sal = basic_sal;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Emp [id:" + id + ",name:" + name + ",basic_sal:" + basic_sal+",deptId:" + deptId;
	}
	
	public double getBasic_sal() {
		return basic_sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract double computeNetSalary(); 



}
