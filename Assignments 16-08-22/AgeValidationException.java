package exceptionhandling;

public class AgeValidationException extends RuntimeException {
public AgeValidationException(String message) {
	super(message);
}
}
