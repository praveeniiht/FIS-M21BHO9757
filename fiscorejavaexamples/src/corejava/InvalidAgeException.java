package corejava;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException() {
		super("Age cannot be more than 100 years");
	}

}
