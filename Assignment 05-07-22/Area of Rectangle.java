import java.util.Scanner;
public class rect
{
	public static void main(String[] args)
	{
		int l,b,a;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter length.:");
		l = s1.nextInt();
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter breadth:");
		b = s2.nextInt();
		a = l*b;
		System.out.println("Area of Rectangle= "+l+" * "+b+" is: "+a);
	}
}
