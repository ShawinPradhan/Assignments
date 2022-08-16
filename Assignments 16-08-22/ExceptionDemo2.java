package exceptionhandling;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//JAVA nested try block
		try(Scanner sc= new Scanner(System.in))//try with resource
		//if we put the scanner object inside try then it will automatically gets closed
		{
			try {
				int a=30, b=0;
				System.out.println(a/b);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("Rest of Code");
			int arr[]= new int[5];
			arr[4] = 90;
			System.out.println("Addition value: "+arr[4]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: Index Out Of Bounds");
		}
		
		//finally block is the last block/the closing block which always gets executed
		finally {
			//sc.close(); //close the scanner object
			System.out.println("Finally block always gets executed.");
		}
		//another alternative of finally close is try with resource

	}

}

