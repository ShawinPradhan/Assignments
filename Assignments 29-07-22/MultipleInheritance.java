// another way of performing multiple inheritance
package abstractiondemo;
abstract class A //declaring an abstract class
{
	abstract void display(); 
	public void demo()
	{
		System.out.println("Abstract Class");
	}
}

interface in //declaring an interface
{
	void add(int a, int b);
}

class Child extends A implements in 
{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum= "+(a+b));
		
	}

	@Override
	void display() {
		System.out.println("Display");
		
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Child child = new Child();
		child.add(10, 20);
		child.demo();
		child.display();

	}

}
