package exceptionhandling;

public class EmployeeNameInvalidException extends RuntimeException {
public EmployeeNameInvalidException(String message)
{
	super(message);
}
}
