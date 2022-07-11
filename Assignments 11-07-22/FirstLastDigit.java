//Program to print the first and last digit of a number
import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		int num,first_digit=0,last_digit=0; //Declaring variable to store the numbers and also first and last digit
		Scanner sc = new Scanner(System.in); //Declaring object for scanner
		System.out.println("Enter the number: ");
		num = sc.nextInt(); //Scanning the number and assigning to num
		last_digit = num%10; //finding the modulus which will give us the last digit
		System.out.println("The last digit of the number is: "+last_digit);
		for(;num>=10;) //checking whether number >= 10
		{
			num = num/10; //dividing the number by 10
			first_digit = num;// putting the value of num in first_digit
		}
		System.out.println("The first digit of the number is: " +first_digit);

	}

}
