//To find the product of two numbers

import java.util.Scanner;
public class product
{
	public static void main(String[] args)
	{
		int n1,n2,prod;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a no.:");
		n1= s.nextInt();
		System.out.println("Enter a no.:");
		n2= s.nextInt();
		prod = n1*n2;
		System.out.println("The product of "+n1+" and "+n2+" is: "+prod);
	}
}
