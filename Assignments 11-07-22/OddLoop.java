//Program to count number of odd numbers in a range
package basicpackage;

import java.util.Scanner;

public class OddLoop {

	public static void main(String[] args) {
		int range, i,count =0; //i is the counter variable that will count loop and range is till which number we want to find odd nos.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range: "); // We need to put the range
		range = sc.nextInt(); // Scanning the input and storing in variable range
		System.out.println("The odd numbers between 1 to "+range+" are: ");
		for(i=1;i<=range;i++) // Here setting the first integer to be 1 and checking whether the number is less than or equal to range and then incrementing it by 1
		{
			if(i%2!=0)// Checking whether the number is divisible by 2 and does not give us a reminder 0 to find odd nos.
				{	
					System.out.println(i);
					count++;
					
				}
		}
		System.out.println("The no. of odd numbers are: "+count);

	}

}

