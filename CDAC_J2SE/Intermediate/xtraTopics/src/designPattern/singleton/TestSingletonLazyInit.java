package designPattern.singleton;

import static designPattern.singleton.SingletonLazyInit.getSingletonInstance;

public class TestSingletonLazyInit {

	public static void main(String[] args) throws Exception{
		//load the class
		Class.forName("design_patterns.SingletonLazyInit");
		SingletonLazyInit ref1 = getSingletonInstance();
		SingletonLazyInit ref2 = getSingletonInstance();
		SingletonLazyInit ref3 = getSingletonInstance();
		System.out.println(ref1==ref2);
		System.out.println(ref1==ref3);

	}

}
