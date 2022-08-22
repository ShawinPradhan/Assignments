package multithreading;
//shared object
class PrintData2{
	static synchronized void multi(int n)
	{
		System.out.println("Outside of Synchronization block");
		synchronized(PrintData2.class)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n+"*"+i+"= "+n*i);
				
				try {
					Thread.sleep(400);
				}catch(Exception e)
				{
					System.out.println(e);
				}
			}
		System.out.println("Rest of code which is not synchronized.");
		}
	}
}

//shared object 2
class PrintData3
{
	static synchronized void add(int a, int b)
	{
		synchronized(PrintData2.class) 
		{
			System.out.println("Addition: "+(a+b));
			try {
				Thread.sleep(400);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class SynchronizationBlock {

	public static void main(String[] args) {
		PrintData2 pd2 = new PrintData2();
		PrintData3 pd3 = new PrintData3();
		
		Thread t1 = new Thread()
		{
			public void run() {
				pd2.multi(5);
			}	
		};
		
		Thread t2 = new Thread()
		{
			public void run() {
				pd2.multi(100);
			}	
		};
		
		Thread t3 = new Thread()
		{
			public void run() {
				pd3.add(5,3);
			}	
		};
		
		Thread t4 = new Thread()
		{
			public void run() {
				pd3.add(10,50);
			}	
		};
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
