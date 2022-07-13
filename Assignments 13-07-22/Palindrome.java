//Program to check whether a number is a palindrome or not

package basicpackage;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int number, rem=0, temp, rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		temp =  number;
		while(number!=0) //checking if the number is not equal to zero
		{
			rem = number%10; // to get the remainder we use modulus
			rev = (rev*10) + rem; // to find the reverse we first multiply it by 10 and add the remainder
			number = number/10; // to get the quotient
		}
		if(temp==rev) //checking if the reverse if the number is as same as the original number 
			System.out.println("The number is a palindrome.");
		else
			System.out.println("The number is not a palindrome");

	}
}
