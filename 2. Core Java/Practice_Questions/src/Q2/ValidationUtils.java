package Q2;

import static Q2.Employee.sdf;

import java.text.ParseException;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class ValidationUtils {
	
	public static Employee validateEmp(String id,String name,String dob,String hiredate,double salary,
											String department) throws CustomXception {
		
		Date birthDate;
		Date joiningDate;
		try {
				birthDate = sdf.parse(dob);
				joiningDate = sdf.parse(hiredate);
				
				if(birthDate.before(joiningDate)){
					// old date api is a bitch!
					int age=Period.between(birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
													     joiningDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
										  .getYears();
					
					if(age < 18)
						throw new CustomXception("You cant hire someone from below age of 18 years!!!");			
				}
				else throw new CustomXception("You cant hire somebody before they are born!!!");
		
				boolean deptMatch=false;
				for(Department d : Department.values()) 
					if(d.toString().toUpperCase().equals(department.toUpperCase())) {
						department=d.toString();
						deptMatch=true;
						break;
					}
				if(!deptMatch)
					throw new IllegalArgumentException();
		
		}catch(ParseException px){
			throw new CustomXception("Invalid Date Format! please try again...");
		}catch(IllegalArgumentException ix) {
			throw new CustomXception("Invalid Department Name...");
		}
		return new Employee(id,name, birthDate,joiningDate,salary,department);
	}
}
