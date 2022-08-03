// WAP to find out the total sum of odd or even number in an array
package arrayexmaples;
import java.util.Scanner;

public class SumOddEvenArray {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int even=0,odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{	
				even ++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println();
		System.out.println("No. of even elements: "+even);
		System.out.println("No. of odd elements: "+odd);

	}

}
