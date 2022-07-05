//To calculate simple interest

import java.util.Scanner;
public class si
{
	public static void main(String[] args)
	{
		int principle,rate,time;
		float interest;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter principle:");
		principle = s.nextInt();
		System.out.println("Enter rate:");
		rate = s.nextInt();
		System.out.println("Enter no. of years:");
		time = s.nextInt();
		interest = (float)(principle*rate*time)/100;
		System.out.println("Simple Interest: "+interest);
	}
}
