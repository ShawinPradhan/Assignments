import java.util.Scanner;
public class product
{
	public static void main(String[] args)
	{
		int n,m,p;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a no.:");
		n= s1.nextInt();
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter a no.:");
		m= s1.nextInt();
		p = n*m;
		System.out.println("The product of "+n+" and "+m+" is: "+p);
	}
}
