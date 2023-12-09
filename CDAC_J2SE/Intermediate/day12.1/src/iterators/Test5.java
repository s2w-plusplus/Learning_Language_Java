package iterators;

import static com.app.core.AccountType.SAVING;
import static utils.CollectionUtils.populateSampleData;
import static utils.ValidationUtils.convertDate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.BankAccount;

public class Test5 {

	public static void main(String[] args) throws ParseException{
		ArrayList<BankAccount> list = populateSampleData();

		// Display elems using explicit iterator
		// attach the itr :
		Iterator<BankAccount> acctItr = list.iterator();
	    list.remove(list.size() - 1);// removing last elem : no exception here : structural modification is done by Iterator API
	
	    //list.set(0,new BankAccount(17, "Rama123", SAVING, convertDate("2-3-2020"), 5600, "hdfc-001"));//no structural modification only replacement
		
	    //	acctItr = list.iterator();//re-attaching iterator
		while (acctItr.hasNext()) {//trying to iterate using SAME itr
			System.out.println(acctItr.next());// acctItr : after the last elem : throws ConcModExc. "failfastness"
		}

		System.out.println("main over...");

	}

}
