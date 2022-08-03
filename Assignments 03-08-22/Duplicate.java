//WAP to count duplicate elements in an array
package arrayexmaples;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in); //declaring object for scanner
		System.out.println("Enter the size of array: ");
		int s = sc.nextInt();
		int a1[] = new int[s]; //declaring array of size s
		System.out.println("Enter "+s+ " elements of an array: ");
		for(int i=0;i<a1.length;i++) //using for loop to take array input from user
		{
			a1[i]= sc.nextInt();
		}
		
		//printing the elements
		System.out.println("Array elements are: ");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		
		//finding duplicate items in the array
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]==a1[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println();
		System.out.println("No. of duplicate elements are: "+count);
	}

}
