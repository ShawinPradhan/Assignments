package multithreading;

public class ThreadDemoEx extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(400); //400 milliseconds
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
	}
	
public static void main(String[] args) {
		ThreadDemoEx t1 = new ThreadDemoEx();
		ThreadDemoEx t2 = new ThreadDemoEx();
		t1.start();
		t2.start();

	}

}
