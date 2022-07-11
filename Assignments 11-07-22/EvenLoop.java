//Program to find even numbers
package basicpackage;
import java.util.Scanner;// importing scanner to scan a number

public class EvenLoop {

	public static void main(String[] args) {
		int range, i; //i is the counter variable that will count loop and range is till which number we want to find even nos.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range: "); // We need to put the range
		range = sc.nextInt(); // Scanning the input and storing in variable range
		System.out.println("The even numbers between 1 to "+range+" is: ");
		for(i=1;i<=range;i++) // Here setting the first integer to be 1 and checking whether the number is less than or equal to range and then incrementing it by 1
		{
			if(i%2==0) // Checking whether the number is divisible by 2 and gives us a reminder 0 to find even nos.
				System.out.println(i);
			
		}
	}

}
