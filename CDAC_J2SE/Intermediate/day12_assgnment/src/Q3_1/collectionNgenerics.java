package Q3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import static java.time.LocalDate.*;

import java.time.LocalDate;

public class collectionNgenerics {

	public static void main(String[] args) {
		
		/*
		 *3.1.1 Collections.shuffle() to shuffle list elements of type String
		 *  	1. Create List of fixed size Strings(Arrays.asList)
		 *	  	2. Then use shuffle method to shuffle this list n print same.
		 **/
		List<String> list1 = Arrays.asList("one","two","three","four","five");
		Collections.shuffle(list1);
		System.out.println(list1);
		/*
		 * 3.1.2 Collections.shuffle() to shuffle list elements of type Double
		 *		1. Create List of fixed size Doubles(Arrays.asList)
		 *		2. Then use shuffle method to shuffle this list n print same.
		 * */
		List<Double> doubles=Arrays.asList(1.0,2.67,3.9,4.1,5.7,98.9,6.0);
		Collections.shuffle(doubles);
		System.out.println(doubles);
		/*
		 * 3.1.3 Write a static , generic method to display details (toString) of collection(AL,LL,V,HS,LHS,TS) of any type.
		 *		Usage : AL<Integer> l1, HS<String> l2 , LL<Date> l3
		 * 		display(l1/l2/l3);
		 * */
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		display(l1);
		HashSet<String> l2=new HashSet<>(Arrays.asList("a1", "a2", "a3", "a4"));
		display(l2);
		LinkedList<LocalDate> l3=new LinkedList<LocalDate>(Arrays.asList( of(2021,12,31),of(1998,2,26),of(2024,7,14) ));
		display(l3);
		/*
		 * 3.1.4 Write a generic method to accept ANY type of the collection(any list or any set) of numbers (int/double/float/byte/short...) 
		 *	 		and return it's sum
		 *	 		eg :
		 *				public static double ......(...){
		 *					//Wrapper : double doubleValue()
		 *				}
		 * */
		List<Number> list;
		list=new ArrayList<>(Arrays.asList(89,4254,6,-9,54));
		System.out.println(sumCollectionNumber(list));		
		list=new LinkedList<>(Arrays.asList(89.32,4.254,6.00,-9.45,0.54));
		System.out.println(sumCollectionNumber(list));		
		list=new Vector<>(Arrays.asList(89.32f,4.254f,6.00f,-9.45f,0.54f));
		System.out.println(sumCollectionNumber(list));
		
		Set<Number> set;
		set=new HashSet<>(Arrays.asList(0b11010001,0b11111111,0b01010101,0b00010000));
		System.out.println(sumCollectionNumber(set));
		set=new LinkedHashSet<>(Arrays.asList(8945658L,4_29_08_45_566L,678999,-945_566L,465000000L));
		System.out.println(sumCollectionNumber(set));
		set=new TreeSet<>(Arrays.asList((short)8956,(short)4666,(short)60055,(short)-7845,(short)-45662));
		System.out.println(sumCollectionNumber(set));
		
		/*
		 * 3.1.5	Use Collections.fill  method , to fill up List of emps with Emp/Mgr/SalesMgr/Worker ....
		 * (Emp or any any sub type of Emp)
		 *
		 **/
		class Emp{}
		class Mgr extends Emp{}
		class SalesMgr extends Emp{}
		class Worker extends Emp{}
		//  public static <T> void fill​(List<? super T> list, T obj)
		List<Emp> emplist=new ArrayList<>(Arrays.asList(new Emp(),new Emp(),new Emp()));
		display(emplist);
		Collections.fill(emplist, new Mgr());
		display(emplist);
		Collections.fill(emplist, new SalesMgr());
		display(emplist);
		Collections.fill(emplist, new Worker());
		display(emplist);
	}

	public static <T> void display(Collection<T> collection) {

		for (T t : collection)
			System.out.print(t + "   ");
		System.out.println();
	}
	/* Alternate Way 
	public static void display2(Collection<?> collection)
	{
		Iterator<?> itr=collection.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
	*/
	
	public static <T extends Number>  double sumCollectionNumber(Collection<T> numbers) {
		double sum = 0;
			for(T t : numbers) 
				sum+=t.doubleValue();
		return sum;
	}

}
