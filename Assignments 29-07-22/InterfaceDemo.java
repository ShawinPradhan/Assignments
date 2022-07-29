//using interface is much more safer than using abstract
//we can have more than one interface
package abstractiondemo;

interface Printable // first interface
{
	int x=100;
	void display();
	void fun();
}

interface Drawable extends Printable //second interface inheriting printable
{
	void draw();
}

interface Sayable //third interface without using extends it inherits both the Printable and Drawable interface
{
	void say();
	int x =10;
}


class Print implements Drawable{

	@Override
	public void display() {
		System.out.println("Display the message.");
		
	}

	@Override
	public void fun() {
		System.out.println("Learning is fun.");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun.");
		
	}	
}

class Message implements Drawable,Sayable //using interface we can perform multilevel inheritance(though not supported by Java)
{ //we can solve the diamond problem(multilevel inheritance) using interface
	// a class can inherit any number of interface

	@Override
	public void display() {
		System.out.println("HELLO");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
	}

	@Override
	public void say() {
		System.out.println("Speaking is fun.");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun.");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// you cannot instantiate interface, but you can create reference variable
		Print print = new Print();
		print.display();
		print.fun();
		print.draw();
		System.out.println("The value of x is: "+Drawable.x); //value of x declare in Printable
		System.out.println();
		Message msg = new Message();
		msg.display();
		msg.fun();
		msg.draw();
		msg.say();
		System.out.println("The value of x is: "+Sayable.x); //value of x declare in Sayable
		

	}

}
