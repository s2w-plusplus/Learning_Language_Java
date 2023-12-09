package Q3_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * 3.4 Write a generic method to accept ANY type of the list of numbers  &   add the specified number to the list. 
	(For understanding PECS)
 */
public class genericListofNumbers {

	public static void main(String[] args) {
		
		ArrayList<Number> AL=new ArrayList<>();
		GenAcceptNAdd(AL,(byte)-128);
		GenAcceptNAdd(AL,(short)-32768);
		System.out.println("Display ArrayList: "+ AL);
	
		
		LinkedList<Number> LL=new LinkedList<>();
		GenAcceptNAdd(LL,456285);
		GenAcceptNAdd(LL,2974802746820L);
		System.out.println("Display LinkedList: "+LL);
		
		Vector<Number> V = new Vector<>();
		GenAcceptNAdd(V,18.26f);
		GenAcceptNAdd(V,869.5646628);
		System.out.println("Display Vector: "+ V);

		//GenAcceptNAdd(AL,"45");//remove comment to see error
		//HashSet<Number> HS=new HashSet<>();
		//GenAcceptNAdd(HS,45);//remove comment to see error
	}



public static <T extends Number> boolean GenAcceptNAdd(List<T> list,T t) 
{
	return list.add(t);
 
}

}