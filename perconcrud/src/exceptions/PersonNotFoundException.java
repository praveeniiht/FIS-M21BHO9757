package exceptions;

public class PersonNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonNotFoundException() {
		super("The given person is not available");
	}

}
