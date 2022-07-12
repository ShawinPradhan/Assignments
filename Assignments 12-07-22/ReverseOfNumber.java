//Program to reverse a number

package basicpackage;
import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int number,rev= 0;
		System.out.println("Enter number to reverse: ");
		Scanner s= new Scanner(System.in);
		number = s.nextInt();
		while(number != 0)
		{
			rev = rev *10;
			rev += number%10;
			number = number /10;
		}
		System.out.println("The reverse of the number is: "+rev);
	}

	}


