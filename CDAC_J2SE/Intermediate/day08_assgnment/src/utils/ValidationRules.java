package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import java.util.regex.Pattern;

import com.app.core.AccessLevel;
import com.app.core.Customer;

import custom_exception.Custom_erXHandle;



public class ValidationRules {
	
	public static SimpleDateFormat sdf;
	private static Date testDate;
	static {
			  try {
				  	sdf = new SimpleDateFormat("dd-MM-yyyy");
				  	testDate = sdf.parse("01-01-1995");
			  		}catch(ParseException p) {
			  			p.printStackTrace();
			  		}
			 }
	
	public static String checkEmail( String email, Customer[] clist) throws Custom_erXHandle {
		if(email==null) 
			throw new Custom_erXHandle("No Email has been passed");
		String myRegex="^[a-zA-Z0-9]+\\.?[a-zA-Z0-9]*?@[a-zA-Z0-9]+\\.com$";
		Pattern P=Pattern.compile(myRegex); 
		if(!P.matcher(email).matches()) 
			throw new Custom_erXHandle("Invalid Email Format"); 
		if(!checkDupEmail(email, clist))
			return email;
		throw new Custom_erXHandle("This Email already exists.No Duplicates allowed!");
	}

	public static boolean checkDupEmail(String email, Customer[] clist ) throws Custom_erXHandle {
		Customer dummy=new Customer(email);
		for(Customer c : clist)
			if(c!=null)
				if (c.equals(dummy)) 
					return true;
		return false;
	}
	
	public static String checkPWD(String passwd) throws Custom_erXHandle {
		if( (passwd.length()>4) && (passwd.length()<10) ) 
			return passwd;
		throw new Custom_erXHandle("Password must be between 4-10 characters long.");
	}
	
	public static double checkRegAmount(double amount) throws Custom_erXHandle {
		if(( amount%500)==0 ) 
			return amount;
		 throw new Custom_erXHandle("Reg. Amount should be in multiples of 500");
	}
	
	public static Date checkDOB(String dob) throws ParseException, Custom_erXHandle{
		Date DOB=sdf.parse(dob);
		if(DOB.before(testDate))
			return DOB;
		throw new Custom_erXHandle("Date of Birth should be before 1st Jan 1995"); 
	}
	
	public static AccessLevel checkEnum(String plan) throws Custom_erXHandle
	{
		try{
				return AccessLevel.valueOf(plan.toUpperCase());
				
			} catch (IllegalArgumentException e) {
		
				StringBuilder prompt = new StringBuilder("Invalid Customer Access Level --- Valid Access Level are");
				prompt.append(Arrays.toString(AccessLevel.values()));
		        throw new Custom_erXHandle(prompt.toString());
			}
		
	}
	
	
}
