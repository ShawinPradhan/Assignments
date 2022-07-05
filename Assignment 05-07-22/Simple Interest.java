import java.util.Scanner;
public class si
{
	public static void main(String[] args)
	{
		int p,r,t;
		float i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter principle:");
		p = s.nextInt();
		System.out.println("Enter rate:");
		r = s.nextInt();
		System.out.println("Enter no. of years:");
		t = s.nextInt();
		i = (float)(p*r*t)/100;
		System.out.println("Simple Interest: "+i);
	}
}
