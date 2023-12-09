package Q3.com.top;

public class Apple extends Fruits {

	public Apple(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString()+" [Taste: "+ this.taste()+" ]";
	}
	
	@Override
	public String taste()
	{
		return "Sweet n Sour.";
	}
	
}
