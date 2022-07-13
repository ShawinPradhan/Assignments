//Program to check whether the number is Armstrong or not 
package basicpackage;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

	public static void main(String[] args) {
		int num, count=0, sum=0 ,rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong or not: ");
		num = sc.nextInt();
		temp=num; // Assigning the value of num in temp
		// to count number of digits
		while(num!=0)
		{
			count++;
			num = num/10;
		}
		temp = num; //Again assigning the value of num in temp
		while(num!=0) // checking whether the number is not equal to 0
		{
			rem = num%10; //to find the remainder of a number 
			sum += Math.pow(rem, count); // using Math.pow function to calculate the power using the no. of digits 
			num = num/10; // to get the quotient
		}
		if(sum==temp) //checking if the original number is equal to the sum
			System.out.println("The number is an Armstrong no. ");
		else
			System.out.println("The number is not an Armstrong no.");

	}

}
