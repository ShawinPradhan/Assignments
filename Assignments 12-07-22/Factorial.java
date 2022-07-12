//Program to find the factorial of a number

package basicpackage;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial:");
		num = sc.nextInt();
		for(int i=1; i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of "+num+" is: "+fact);

	}

}
