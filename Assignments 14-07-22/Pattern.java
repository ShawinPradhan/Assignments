//Program to print pattern
package basicpackage;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		int i,j,n,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		n =sc.nextInt();
		System.out.println("Choose which to print: 1)Half Pyramid \n 2)Inverted Half Pyramid");
		choice = sc.nextInt();
		if(choice==1) 
		{
			for(i=1;i<=n;i++) //row
			{
				for(j=1;j<=i;j++) //column 
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(choice==2) 
		{
			for(i=1;i<=n;i++)
			{
				for(j=i;j<=n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Wrong Entry");

	}

}
