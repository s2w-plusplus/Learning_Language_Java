package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
   3.1 Collections.shuffle() to shuffle list elements of type string
1. Create List of fixed size Strings(Arrays.asList)
   -Then use shuffle method to shuffle this list n print same.
2. Create List of fixed size Doubles(Arrays.asList)
   -Then use shuffle method to shuffle this list n print same.
 */

public class Test1 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("one","two","three","four","five");
		//Collections API : public static void shuffle​(List<?> list) : unbounded wild card
		Collections.shuffle(list1);
		System.out.println(list1);
		List<Double> doubles=Arrays.asList(1.0,2.67,3.9,4.1,5.7,98.9,6.0);//double --->Double
		//autoboxing (int --> Integer --X Double)
		Collections.shuffle(doubles);
		System.out.println(doubles);
		

	}

}
