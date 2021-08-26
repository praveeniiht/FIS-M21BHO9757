package corejava;

public class NegativeAgeException extends RuntimeException{
	public NegativeAgeException() {
	 super("Age cannot be negative");
	}
}
