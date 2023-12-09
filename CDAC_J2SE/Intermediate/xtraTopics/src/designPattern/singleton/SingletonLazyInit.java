package designPattern.singleton;

public class SingletonLazyInit {
	private static SingletonLazyInit ref;

	private SingletonLazyInit() {

	}

	public static SingletonLazyInit getSingletonInstance() {
		if (ref == null)
			ref = new SingletonLazyInit();
		return ref;
	}

}
