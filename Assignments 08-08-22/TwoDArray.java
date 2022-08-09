//Program to create a two dimensional array
package arrayexmaples;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//compile-time initialization
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("2-D Array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Enter the no. of rows:");
		int row = sc.nextInt();
		System.out.println("Enter the no. of columns:");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter "+row+"x"+col+" array:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(row+"x"+col+" Array:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		Class c = a.getClass();
		String name =c.getName();
		System.out.println("Class name is: "+name);

	}

}
