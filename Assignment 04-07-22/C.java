import java.util.Scanner;
import mypack.*;
public class C
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a no.:");
		n= s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter a no.:");
		m= s2.nextInt();
		A obj=new A();
		obj.min(n,m);
		 
	}
}
