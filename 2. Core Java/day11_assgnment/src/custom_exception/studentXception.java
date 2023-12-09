package custom_exception;

@SuppressWarnings("serial")
public class studentXception extends Exception{
	public studentXception(String errMsg){
		super(errMsg);	
	}
}
