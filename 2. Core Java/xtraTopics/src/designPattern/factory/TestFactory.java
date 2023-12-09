package designPattern.factory;
import static designPattern.factory.ShapeFactory.getShape;
public class TestFactory {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			getShape().draw();
		}

	}

}
