package Q4.tester;

import java.lang.Exception;
import static Q4.com.app.core.Course.REACT;
import static Q4.com.app.core.Student.sdf;
import static Q4.utils.CollectionUtils.populateSampleData;

import java.util.HashSet;

import Q4.com.app.core.Student;
public class TestStudent {
	
	public static void main(String args[]) 
	{
		
	try {	
		HashSet<Student> hSet =new HashSet<>(populateSampleData());
		System.out.println("set:"+hSet);
		System.out.println("Trying to add duplicate:"+hSet.add(new Student("12001273E","Saurabh","saurabh@gmail.com","mypassword1",REACT,9.9,sdf.parse( "12-3-2007" ))));//trying to add duplicate
		System.out.println("set:"+hSet);	
	
	
		}catch(Exception e){
			System.out.println(e);
		}
	
	
	}
	
}