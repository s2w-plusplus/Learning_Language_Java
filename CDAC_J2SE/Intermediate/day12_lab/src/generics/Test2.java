package generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 3. Write a static , generic method to display details (toString) of collection(AL,LL,V,HS,LHS,TS) of any type.
Usage : AL<Integer> l1, HS<String> l2 , LL<Date> l3
display(l1/l2/l3);
 */
public class Test2 {

	public static void main(String[] args) {
		display(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
		System.out.println();
		display(new LinkedList<>(Arrays.asList("a1", "a2", "a3", "a4")));
		System.out.println();
		display2(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
		System.out.println();
		display2(new LinkedList<>(Arrays.asList("a1", "a2", "a3", "a4")));

	}

	// static generic method
	public static <T> void display(Collection<T> collection) {

		for (T t : collection)
			System.out.print(t + " ");
	}

	public static void display2(Collection<?> collection)
	{
		Iterator<?> itr=collection.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}

}
