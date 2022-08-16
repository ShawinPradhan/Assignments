package exceptionhandling;
import java.util.Scanner;
import exceptionhandling.NumDivisibleException;

public class Divisible511 {

	static void numDivisible(int num)
	{
		if((num%5!=0) && (num%11!=0))
		{
			//using throw keyword
			throw new NumDivisibleException(num+" is not divisble by 5 and 11.");
		}
		else
			System.out.println(num+" is divisible by both 5 and 11.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		try {
			numDivisible(n);//calling the method
		}
		catch(NumDivisibleException e)//catching the user define exception
		{
			System.out.println(e.getMessage());//getting the message
		}
		
				
		
	}

}
