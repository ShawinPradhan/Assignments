import java.util.Scanner;
public class average
{
	public static void main(String[] args)
	{
		int a,b,c,d,e,sum,avg;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter first marks:");
		a = obj.nextInt();
		System.out.println("Enter second marks:");
		b = obj.nextInt();
		System.out.println("Enter third marks:");
		c = obj.nextInt();
		System.out.println("Enter fourth marks:");
		d = obj.nextInt();
		System.out.println("Enter fifth marks:");
		e = obj.nextInt();
		sum = (a+b+c+d+e);
		avg = sum/5;
		System.out.println("The average of 5 subjects is: "+avg);
	}
}
