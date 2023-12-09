package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(new Emp(), new Mgr());
		//Type of List : Emp
		// Since we are adding element in the List , it's currently acting as Consumer
		//PECS : Producer extend Consumer super
		//so using ? super T => if you want to add Emp or Mgr or SalesMgr type , the type of the List has to be 
		//either Emp or Object
		
		/* public static <T> void fill​(List<? super T> list, T obj) 
		 * Replaces all of the elements of the specified list with the specified element.
		 */
		
		Collections.fill(list,new Mgr());
		Collections.fill(list,new SalesMgr());
		
		List<Object> list2 = Arrays.asList(new Emp(), new Mgr());
		Collections.fill(list2,new Emp());
		Collections.fill(list2,new SalesMgr());
		Collections.fill(list2, new Worker() );
		Collections.fill(list2,new Date());
		Collections.fill(list2, 1234);
		//Another example : where List acts as the consumer
		List<Mgr>mgrs=new ArrayList<Mgr>();
		mgrs.add(new Mgr());
		mgrs.add(new SalesMgr());
	//	mgrs.add(new Emp());//un comment to understand err
	//	List<Emp> emps=mgrs;//un comment to understand err
		List<? extends Emp> emps=mgrs; //since List is acting as the producer : extends
		//acting as a producer
		for(Emp e : emps)
			System.out.println(e);
	
	}

}
