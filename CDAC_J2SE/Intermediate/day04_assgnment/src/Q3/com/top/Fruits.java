package Q3.com.top;

public class Fruits 
{
	private String name;

	public Fruits(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruits [name: " + name + " ]";
	}
	
	
	public String taste()
	{
	return "Fruits in general have varying tastes";
	}

	
	public String getFName() {
		return name;
	}


}
