package multithreading;

public class DeadlockDemo {

	public static void main(String[] args) {
		final String resource1="paper";
		final String resource2="pen";
		
		//Thread 1 locks resource1: paper 
		Thread paper = new Thread()
		{
			public void run()
			{
				synchronized(resource1) {
					System.out.println("Thread1 Locked Resource1: Paper");
					
					try {
						Thread.sleep(100);
					}catch(Exception e)
					{
						System.out.println(e);
					}
				//Thread 1 wants to lock resource2: pen
				synchronized(resource2)
				{
					System.out.println("wanted to lock resourse2: pen");
				}
				}
			}
		};
		
		//Thread 2 locks resource2: pen 
		Thread pen = new Thread()
		{
			public void run()
			{
				synchronized(resource2) {
					System.out.println("Thread2 Locked Resource1: Pen");
					
					try {
						Thread.sleep(100);
					}catch(Exception e)
					{
						System.out.println(e);
					}
				//Thread 2 wants to lock resource1: paper
				synchronized(resource1)
					{
						System.out.println("wanted to lock resource1: paper");
					}
				}
			}
		};
				
		paper.start();
		pen.start();
		//since each thread has locked one of each resources and not releasing
		//while the other thread waits, this put it in a state of deadlock

	}

}
