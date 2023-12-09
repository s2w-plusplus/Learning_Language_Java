package Q2.com.app.org;

public class Worker extends Emp 
{
	private int hoursWorked;
	private int hourlyRate;
	
	public Worker(int id, String name, double basic_sal, String deptId, int hoursWorked, int hourlyRate) 
	{
		super(id, name, basic_sal, deptId);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString()
	{
		return super.toString()+",hoursWorked:" + hoursWorked + ",hourlyRate:" + hourlyRate + "] is a Worker";
	}

	public int getHourlyRate() 
	{
		return hourlyRate;
	} 
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double computeNetSalary() 
	{
		return (super.getBasic_sal()+(hoursWorked*hourlyRate)); 
		
	}


	
}
