//Program to count number of digits in a number
package basicpackage;
import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		int num, i , temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		temp = num;
		for(i=0; num!=0;)
		{
			i++;
			num = num/10;
		}
		System.out.println("The no. of digits in "+temp+" is: "+i);
		
	}

}
