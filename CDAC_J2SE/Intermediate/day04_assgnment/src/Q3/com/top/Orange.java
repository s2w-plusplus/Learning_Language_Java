package Q3.com.top;

public class Orange extends Fruits {

	public Orange(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString()+ " [Taste: "+ this.taste()+" ]";
	}
	
	@Override
	public String taste()
	{
		return "Sour.";
	}
	
}
