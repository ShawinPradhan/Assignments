package multithreading;

class Account{
	//initial account balance
	int accBalance = 10000;
	
	//synchronized withdraw method
	synchronized void withdraw(int amount) 
	{
		System.out.println("Start withdrawing");
		if(this.accBalance<amount)
		{
			System.out.println("Balance low: Please deposit.");
			try {
				wait();
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		this.accBalance=accBalance-amount;
		System.out.println("Rs. "+amount+" withdrawl was successful.");
	}
	
	//synchronized deposit method
	synchronized void deposit(int amount)
	{
		System.out.println("Starting deposit.");
		this.accBalance = accBalance+amount;
		System.out.println("Rs. "+amount+" has been sucessfully deposited.");
		notifyAll();
	}
	
	//synchronized method to display the account balance
	synchronized void display()
	{
		System.out.println("Displaying Account balance.");
		try {
			wait(300);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Balance: Rs. "+this.accBalance);
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Account acc = new Account();//declaring object for the class
		
		//declaration of anonymous thread
		new Thread()
		{
			public void run()
			{
				acc.withdraw(15000); //withdrawing 15000
			}
		}.start(); //starting the thread
		
		
		new Thread()
		{
			public void run()
			{
				acc.deposit(20000); //depositing 20000
			}
		}.start();
		
		
		new Thread()
		{
			public void run()
			{
				acc.display(); //displaying the balance
			}
		}.start();
	}

}
