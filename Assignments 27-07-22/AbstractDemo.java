package abstractiondemo;

// we cannot create instance but we can create reference variable
abstract class Bank{
	//abstract method - method has no body
	//must be declared as abstract keyword and end with a semicolon
	abstract public void getLoanInterest();
	
	//concrete method - method has a body
	public void display() {
		System.out.println("This is a bank class.");
	}
}

//implementation class
class SBI extends Bank{

	@Override
	public void getLoanInterest() //abstract method called and implemented
	{
		System.out.println("SBI is providing 6.5% interest.");
		
	}
}

class HDFC extends Bank{

	@Override
	public void getLoanInterest() {
		System.out.println("HDFC is providing 8.75% interest.");
	
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Bank b;
		b= new SBI();
		b.getLoanInterest();
		b.display();
		System.out.println();
		
		HDFC hdfc= new HDFC();
		hdfc.getLoanInterest();
		hdfc.display();
	}

}
