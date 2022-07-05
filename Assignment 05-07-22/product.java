import java.util.Scanner;
public class product
{
	public static void main(String[] args)
	{
		int n,m,p;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a no.:");
		n= s.nextInt();
		System.out.println("Enter a no.:");
		m= s.nextInt();
		p = n*m;
		System.out.println("The product of "+n+" and "+m+" is: "+p);
	}
}
