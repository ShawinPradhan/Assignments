package exceptionhandling;
import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		//int arr[] =new int[5];
		String str ="hi";
		try {
			System.out.println(str.length());
			int i =Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			System.out.println("You can't convert a String into integer");
			//
			//System.out.println(e);
			//e.printStackTrace();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured: "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured: "+e.getMessage());
		}
		//Exception is like the parent class which contains all the exceptions
		//If you don't know which exception is to be used we can simply do the below
		catch(Exception e) //parent of all exceptions
		{
			System.out.println(e.getMessage());
		}
		//this can be used so that we don't need to add so many exceptions in a code
		//if we put other exception under this then it will throw an error that the exception has already been handled
		System.out.println("Rest of code");
		int a=10, b=30;
		System.out.println("Addition Value: "+(a+b));
		
	
	}

}
