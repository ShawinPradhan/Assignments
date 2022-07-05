import java.util.Scanner;
public class si
{
	public static void main(String[] args)
	{
		int i,p,r,t;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter principle:");
		p = s1.nextInt();
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter rate:");
		r = s2.nextInt();
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter no. of years:");
		t = s3.nextInt();
		i = (p*r*t)/100;
		System.out.println("Simple Interest: "+i);
	}
}
