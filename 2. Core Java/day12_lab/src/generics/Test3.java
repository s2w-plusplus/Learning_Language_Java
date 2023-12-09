package generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

/*
 * 3.3 Write a generic method to accept 
 * ANY type of the collection(any list or any set) of numbers (int/double/float/byte/short...) n return it's sum
 */
public class Test3 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(Arrays.asList(10,20,30,40));
		System.out.println("sum "+add(v1));

	}
	public static double add(Collection<Integer> coll)
	{
		double sum=0;
		for(int i : coll)
			sum += i;
		return sum;
	}
	

}
//improved in test4