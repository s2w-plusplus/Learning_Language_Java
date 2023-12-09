package nested_class;

public class Outer {
	private int i = 10;

	public static void main(String[] args) {
		Outer.Inner innerRef = new Outer().new Inner();
		innerRef.show(30);

	}

	class Inner {
		private int i = 20;

		void show(int i) {
			System.out.println(i);//30
			System.out.println(this.i);//this => Inner class object ref : 20
			System.out.println(Outer.this.i);//10
		}
	}

}
