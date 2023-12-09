package nested_class;

public class TestInnerClass {

	public static void main(String[] args) {
		// invoke innerDisplay() ,to display all 4 data members
		Outer.Inner in=new Outer(123).new Inner(45); //outer object needs to be created before creating inner object
		in.innerDisplay();
		

	}

}
