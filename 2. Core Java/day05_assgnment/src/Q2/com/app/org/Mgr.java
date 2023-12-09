package Q2.com.app.org;

public class Mgr extends Emp 
{
  private int performanceBonus;
    
  public Mgr(int id, String name, double basic_sal, String deptId, int performanceBonus) 
  	{
	super(id, name, basic_sal, deptId);
	this.performanceBonus = performanceBonus;
  	}

  @Override
  public String toString() 
  {
	return  super.toString()+ ",performanceBonus:" + performanceBonus +"]  is a Manager";
  }

  public int getPerformanceBonus() 
  {	
	return performanceBonus;
  }
  
  public void setPerformanceBonus(int performanceBonus) {
	this.performanceBonus = performanceBonus;
}

@Override
  public double computeNetSalary() 
	{
	 return (super.getBasic_sal()+performanceBonus);
		
	}

 


}
