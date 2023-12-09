package designPattern.singleton;

public class SingletonEagerInit {
	private static final SingletonEagerInit ref;
	static {
		System.out.println("in static init block...");
		ref=new SingletonEagerInit();
	}

	private SingletonEagerInit() {

	}

	public static SingletonEagerInit getSingletonInstance() {
		
		return ref;
	}

}
