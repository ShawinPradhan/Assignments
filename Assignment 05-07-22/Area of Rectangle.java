import java.util.Scanner;
public class rect
{
	public static void main(String[] args)
	{
		int l,b,a;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter length.:");
		l = s.nextInt();
		System.out.println("Enter breadth:");
		b = s.nextInt();
		a = l*b;
		System.out.println("Area of Rectangle= "+l+" * "+b+" is: "+a);
	}
}
