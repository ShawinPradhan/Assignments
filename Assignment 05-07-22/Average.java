//To find the average of 5 subjects

import java.util.Scanner;
public class average
{
	public static void main(String[] args)
	{
		int sub1,sub2,sub3,sub4,sub5,sum,avg;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter first subject marks:");
		sub1 = obj.nextInt();
		System.out.println("Enter second subject marks:");
		sub2 = obj.nextInt();
		System.out.println("Enter third subject marks:");
		sub3 = obj.nextInt();
		System.out.println("Enter fourth subject marks:");
		sub4 = obj.nextInt();
		System.out.println("Enter fifth subject marks:");
		sub5 = obj.nextInt();
		sum = (sub1+sub2+sub3+sub4+sub5);
		System.out.println("Total sum of marks: "+sum);
		avg = sum/5;
		System.out.println("The average of 5 subjects is: "+avg);
	}
}
