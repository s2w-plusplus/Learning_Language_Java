package custom_exc;

public class BookHandlingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookHandlingException(String mesg) {
		super(mesg);
	}
}
