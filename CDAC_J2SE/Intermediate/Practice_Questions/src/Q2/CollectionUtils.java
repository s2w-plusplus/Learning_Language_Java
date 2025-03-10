package Q2;

import static Q2.Employee.sdf;

import java.text.ParseException;
import java.util.HashMap;;
public class CollectionUtils {
	
	static HashMap<String,Employee> populateMap(){

		HashMap<String,Employee> employees = new HashMap<>();
		try {
			employees.put("A1",new Employee("A1","JohnDoe1",sdf.parse("01-10-1984"),sdf.parse("01-04-2004"),8500.00,"HumanResource"));
			employees.put("A2",new Employee("A2","JohnDoe2",sdf.parse("01-10-1970"),sdf.parse("01-04-1990"),85000.00,"Deployment"));
			employees.put("A3",new Employee("A3","JohnDoe3",sdf.parse("01-10-1988"),sdf.parse("01-04-2008"),85000.00,"Engineering"));
			employees.put("A4",new Employee("A4","JohnDoe4",sdf.parse("01-10-1994"),sdf.parse("01-04-2021"),85000.00,"Accounts"));
			employees.put("A5",new Employee("A5","JohnDoe5",sdf.parse("01-10-1991"),sdf.parse("01-04-2011"),85000.00,"Management"));
			employees.put("A6",new Employee("A6","JohnDoe6",sdf.parse("01-10-2000"),sdf.parse("01-04-2015"),85000.00,"CustomerService"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return  employees ;
		
	}
	
	
       
}
