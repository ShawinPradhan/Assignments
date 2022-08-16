package exceptionhandling;

import exceptionhandling.AgeValidationException;

public class ThrowKeywordDemo {

	static void validateAge(int age) {
		
		if(age<18)
		{
			throw new AgeValidationException("Age is not valid to vote!");
		}
		else
			System.out.println("Age is valid.");
	}
	
	public static void main(String[] args) {
		try {
			validateAge(12);
		}
		catch(AgeValidationException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Thank you for visiting.");

	}

}
