// Program to find strong number
package basicpackage;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		int num,rem,fact,sum=0,temp; //declaring constant variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		temp=num; //storing the value of num in temp variable
		while(num!=0) //checking whether num is not equal to zero
		{
			rem = num%10; // getting the reminder
			fact=1; //setting value of fact as 1
			for(int i=1;i<=rem;i++) 
			{
				fact = fact *i; //finding the factorial
			}
			sum += fact; //adding the factorial to the sum
			num=num/10; // getting quotient
		}
		if(temp==sum) //checking if the original number is equal to the sum
			System.out.println(temp+" is a Strong number.");
		else
			System.out.println(temp+" is not a Strong number.");
		

	}

}
