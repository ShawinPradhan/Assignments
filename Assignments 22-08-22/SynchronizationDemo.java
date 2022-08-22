package multithreading;

//shared object
class PrintData{
	
	
	//void multiplication(int n) //method not synchronized
	//to synchronize we just need to use the keyword synchronized
	synchronized void multiplication(int n) //method synchronized
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
		}//end of for loop
	}
}//end of synchronization

/*class Thread1 extends Thread
{
	PrintData t;
	public Thread1(PrintData t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.multiplication(5);
	}
}

class Thread2 extends Thread
{
	PrintData t;
	public Thread2(PrintData t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.multiplication(100);
	}
} */


public class SynchronizationDemo {

	public static void main(String[] args) {
		//only one object of printData class
		
		PrintData pd = new PrintData();
		
		//two thread object which will share above object
		//Thread1 t1 = new Thread1(pd);
		//Thread2 t2= new Thread2(pd);
		
		//anonymous class
		//with the help of anonymous class we can reduce the size of the code
		Thread t1 = new Thread()
		{
			public void run() {
				pd.multiplication(5);
			}	
		};
		
		Thread t2 = new Thread()
		{
			public void run() {
				pd.multiplication(100);
			}	
		};
		
		t1.start();
		t2.start();
		
	}

}
