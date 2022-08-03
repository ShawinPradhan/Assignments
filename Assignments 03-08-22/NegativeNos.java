//WAP to find out all the negative numbers in an array and print all those negative numbers
package arrayexmaples;
import java.util.Scanner;
public class NegativeNos {

	public static void main(String[] args) {
		int a[] = new int[5]; //declaring array of size 5
		Scanner sc = new Scanner(System.in); //declaring object for scanner
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<a.length;i++) //using for loop to take array input from user
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("The negative nos. are: ");
		for(int i=0;i<a.length;i++) //printing all the negative numbers
		{
			if(a[i]<0) //checking if number is less than 0
			{
				System.out.println(a[i]);
			}
			
		}
		
		
	}

}
