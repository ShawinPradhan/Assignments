// Program to calculate the sum of n natural numbers

package basicpackage;
import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum = sum+i;
		}
		System.out.println("The sum of "+num+" natural numbers is: "+sum);

	}

}
