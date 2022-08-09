package arrayexmaples;

public class JaggedArray {

	public static void main(String[] args) {
		int i,j;
		int arr[][]= new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		
		//initializing jagged array
		int count=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		}
		
		//printing a jagged array
		System.out.println("Jagged Array: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();//new line
		}
		

	}

}
