package Q3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/*
 * 3.3 Write a generic method to accept 
 * ANY type of the collection(any list or any set) of numbers (int/double/float/byte/short...) n return it's sum
 */

public class listNsetOfNumbers {

	public static void main(String[] args) {
		//Integer IS A Number : true
		//Collection<Integer> IS A Collection<Number> : false
		
		ArrayList<Byte> AL=new ArrayList<>(Arrays.asList((byte)-128,(byte)5,(byte)125,(byte)127));
		System.out.println("sum of AL<Byte>: "+add(AL));
		System.out.println("sum of AL<Byte>: "+add2(AL));
		
		LinkedList<Short> LL=new LinkedList<>(Arrays.asList((short)-32768,(short)-50,(short)50,(short)32767));
		System.out.println("sum of LL<Short>: "+add(LL));
		System.out.println("sum of LL<Short>: "+add2(LL));
		
		Vector<Integer> V = new Vector<>(Arrays.asList(10,20,30,40));
		System.out.println("sum of V<Integer>: "+add(V));
		System.out.println("sum of V<Integer>: "+add2(V));
		
		HashSet<Double> HS =new HashSet<>(Arrays.asList(10.0,20.5,30.67,40.12));
		System.out.println("sum of HS<Double>: "+add(HS));
		System.out.println("sum of HS<Double>: "+add2(HS));

		TreeSet<Float> TS=new TreeSet<>(Arrays.asList(10.0f,20.5f,30.67f,40.12f));
		System.out.println("sum of TS<Float>: "+add(TS));
		System.out.println("sum of TS<Float>: "+add2(TS));
		
		ArrayList<String> xAL=new ArrayList<>(Arrays.asList("a","b","c","d"));
		//add(xAL);//remove comment to see error
		
		TreeMap<Integer,String> TM=new TreeMap<>();
		//add(TM);//remove comment to see error
	}
	
	
	
	public static double add(Collection<? extends Number> coll)
	{
		Iterator<? extends Number> itr=coll.iterator();
		double sum=0;
		while(itr.hasNext())
			sum += itr.next().doubleValue();
		return sum;
	}
	public static <T extends Number>double add2(Collection<T> coll)
	{
		double sum=0;
		for(T t : coll)
			sum += t.doubleValue();
		return sum;			
	}
	

}

