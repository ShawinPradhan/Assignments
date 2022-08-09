//WAP to delete an element from a specific position

package arrayexmaples;
import java.util.Scanner;

public class DeleteElementSpecificPosition {

	public static void main(String[] args) {
		int a[] = new int[20];
		int size,pos,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		
		System.out.println("Enter "+size+" elements of the array:");
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		
		//printing array before deletion
		System.out.println("Array before deletion:");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter the position from where you want to delete:");
		pos= sc.nextInt();
		
		//checking the position is valid or not
		if(pos>size+1 || pos<0)
		{
			System.out.println("Invalid Position!");
		}
		else
		{
	//removing the element from the position and shifting other nos. in its position
			for(i=pos-1;i<size;i++)
			{
				a[i]=a[i+1];
			}
			
			//decrementing the size
			size--;
			
			//printing the array after deletion
			System.out.println("Array after deletion: ");
			for(i=0;i<size;i++)
			{
				System.out.print(a[i] +" ");
			}
		}

	}

}
