package java8features;

@FunctionalInterface
interface message {
	
	void say();
	
	default void msg()
	{
		System.out.println("Default with method body.");
	}
	//can contain any number of Object class method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceDemo implements message{

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();
		demo.msg();
		demo.say();

	}

	@Override
	public void say() {
		System.out.println("Saying hello");		
	}

}
/*Functional interface- an interface that contains exactly one abstract method
 * is known as function interface.It can have any number of defaults, static method
 * but can contain only one abstract method. It can also declare methods of 
 * Object class.
 * 
 * It is also known as single abstract method interface or SAM interface. It
 * helps to achieve functional programming approach.
 * 
 * 
 * Invalid functional interface - a functional interface can
 */
