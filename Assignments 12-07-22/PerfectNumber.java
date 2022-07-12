//Program to check whether a number is perfect or not.

package basicpackage;
import java.util.Scanner; // importing Scanner to scan a number

public class PerfectNumber {
	public static void main(String[] args)
	{
		int num,sum=0; // declaring variables to store the number and to store the sums of the numbers
		Scanner sc = new Scanner(System.in); // declaring an object for scanner
		System.out.println("Enter a number to check perfect or not: ");
		num = sc.nextInt(); // storing the number in variable in num
		for(int i=1;i<num;i++) /* starting with number 1 and checking whether the divisor is less than the number and
		incrementing the divisor*/
		{
			if(num%i==0) // checking whether the number is completely divisible by the number
			{
				sum= sum+i;// if completely divisible then adding the number to the sum
			}
		}
		if(sum==num) //lastly checking whether the sum is equal to the number entered if equal then perfect no else not
			System.out.println(num+" is a perfect number.");
		else
			System.out.println(num+ " is not a perfect number.");
	}

}
