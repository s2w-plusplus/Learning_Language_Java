package designPattern.factory;

import java.util.Random;

public class ShapeFactory {
	public static final Random random;
	static {
		random = new Random();
	}

	public static Shape getShape() {
		switch (random.nextInt(3)) {
		case 0:
			return new Circle();

		case 1:
			return new Rectangle();
		case 2:
			return new Triangle();
		default:
		//	throw new RuntimeException("Invalid number!!!!");
			return null;

		}
	}
}
