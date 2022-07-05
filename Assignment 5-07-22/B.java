import mypack.*;
import java.util.Scanner;
class B
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no.:");
		n= s.nextInt();
		A obj= new A();
		obj.fact(n);
		
	}
}
