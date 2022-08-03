//Creation of Array
package arrayexmaples;
import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		//create array at compile time
		int arr[]= {2,6,5,9,4};
		
		//print the array elements using for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" element-->"+arr[i]);
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		//create array at run time
		int arr1[]= new int[5]; //array is static thus we cannot change the size at run time
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]= sc.nextInt();
		}
		//printing the array using for loop
		System.out.println("Printing using for loop: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(i+" element-->"+arr1[i]);
		}
		
		//printing the array using for each loop
		System.out.println();
		System.out.println("Printing using for each loop: ");
		for(int var:arr1)
		{
			System.out.println(var);
		}
		
	}

}
