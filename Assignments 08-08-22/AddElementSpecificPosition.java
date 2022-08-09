// WAP to enter an element in a specific position

package arrayexmaples;
import java.util.Scanner;
public class AddElementSpecificPosition {

	public static void main(String[] args) {
		int a[] = new int[20];
		int size,num,pos,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = sc.nextInt();
		
		
		System.out.println("Enter "+size+" elements of the array:");
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		
		//printing array before insertion
		System.out.println("Array before insertion:");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//input new element on the entered position
		System.out.println("Enter element you want to insert:");
		num = sc.nextInt();
		
		System.out.println("Enter the position where you want to insert:");
		pos= sc.nextInt();
		
		//checking the position is valid or not
		if(pos>size+1 || pos<0)
		{
			System.out.println("Invalid Position!");
		}
		else
		{
			//making room for new elements: shifting
			for(i=size;i>=pos;i--)
			{
				a[i]=a[i-1];
			}
			//insert new element at the given position and increment size
			a[pos-1]=num;
			size++;
			
			//printing the array after insertion
			System.out.println("Array after insertion: ");
			for(i=0;i<size;i++)
			{
				System.out.print(a[i] +" ");
			}
		}
		
		
	}

}
