import java.util.Scanner;
public class average
{
	public static void main(String[] args)
	{
		int a,b,c,d,e,sum,avg;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter first marks:");
		a = s1.nextInt();
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter second marks:");
		b = s2.nextInt();
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter third marks:");
		c = s3.nextInt();
		Scanner s4= new Scanner(System.in);
		System.out.println("Enter fourth marks:");
		d = s4.nextInt();
		Scanner s5= new Scanner(System.in);
		System.out.println("Enter fifth marks:");
		e = s5.nextInt();
		sum = (a+b+c+d+e);
		avg = sum/5;
		System.out.println("The average of 5 subjects is: "+avg);
	}
}
