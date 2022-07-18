// Simple Calculator
package basicpackage;
import java.util.Scanner;

public class Calculator {
	public static int addition(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public static int subtraction(int a, int b)
	{
		if(a>b)
		{
			int c = a-b;
			return c;
		}
		else
		{
			int c = b-a;
			return c;
		}
	}
	public static float division(float a, float b)
	{
		float c = a/b;
		return c;
	}
	public static int multiply(int a, int b)
	{
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		int choice , num1, num2, res;
		float num3, num4, res1;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Choose which operation to perform: ");
		System.out.println("1)Addition  2)Subtraction  3)Division  4)Multiply  5)Exit");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter first number: ");
			num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			num2 = sc.nextInt();
			res = Calculator.addition(num1,num2);
			System.out.println("Addition of "+num1+" + "+num2+" is: "+res);
			System.out.println();
			break;
		
		case 2:
			System.out.print("Enter first number: ");
			num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			num2 = sc.nextInt();
			res =Calculator.subtraction(num1,num2);
			System.out.println("Subraction of "+num1+" - "+num2+" is: "+res);
			System.out.println();
			break;
		
		case 3:
			System.out.print("Enter first number: ");
			num3 = sc.nextFloat();
			System.out.print("Enter second number: ");
			num4 = sc.nextFloat();
			res1 =Calculator.division(num3, num4);
			System.out.println("Division of "+num3+" / "+num4+" is: "+res1);
			System.out.println();
			break;
			
		case 4:
			System.out.print("Enter first number: ");
			num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			num2 = sc.nextInt();
			res =Calculator.multiply(num1,num2);
			System.out.println("Multiplication of "+num1+" * "+num2+" is: "+res);
			System.out.println();
			break;
			
		case 5:
			break;
			
		default:
			System.out.println("Wrong Choice!!");
		}//end of switch
		
		}//end of do
		while(choice!=5);

	}

}
