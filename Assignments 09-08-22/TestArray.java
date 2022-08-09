package arrayexmaples;

public class TestArray {
	
	public static int[] get()
	{
		int arr[] = {56,89,45,99,1};
		return arr;
	}
	
	static void minElement(int ar[]) {
		int min = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
				min=ar[i];
		}
		
		System.out.println("Minimum number: "+min);
	}
	
	static void maxElement(int ar[])
	{
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
				max=ar[i];
		}
		
		System.out.println("Maximum number: "+max);
	}
	public static void main(String[] args) {
		
		int a[]= {33,6,5,89,7};
		minElement(a);//passing array to method
		
		//passing anonymous array to method
		maxElement(new int[] {33,6,5,89,7});
		
		System.out.println();
		int b[]= get();
		for(int var:b)
		{
			System.out.print(var+" ");
		}

	}

}
