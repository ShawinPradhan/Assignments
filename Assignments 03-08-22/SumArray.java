//WAP to find the sum of 5 elements of an array
package arrayexmaples;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //declaring object for scanner
		int sum =0;
		int a[]= new int[5]; //declaring array
		//taking input
		System.out.println("Enter array elemetns: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		//finding sum
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		
		System.out.println("Sum of array elements: "+sum);
		
		

	}

}
