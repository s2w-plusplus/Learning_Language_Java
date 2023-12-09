package Q3.com.top;

public class Mango extends Fruits {

	public Mango(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString()+ " [Taste: "+ this.taste()+" ]";
	}
	
	@Override
	public String taste()
	{
		return "Sweet.";
	}
	
}
