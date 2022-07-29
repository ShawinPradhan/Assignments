package abstractiondemo;

interface Add{
	void addnum(int a, int b);
}

interface Sub extends Add{
	void subnum(int a, int b);
}

interface Div extends Sub{
	void divnum(int a, int b);
}

interface Mul{
	void mulnum(int a, int b);
}

class Math implements Mul,Div
{

	@Override
	public void divnum(int a, int b) {
		System.out.println("Division: "+(a/b));
		
	}

	@Override
	public void mulnum(int a, int b) {
		System.out.println("Multiplication: "+(a*b));
		
	}

	@Override
	public void subnum(int a, int b) {
		System.out.println("Substraction: "+(a-b));
		
	}

	@Override
	public void addnum(int a, int b) {
		System.out.println("Addition: "+(a+b));
		
	}
	
}

public class HybridInheritance {

	public static void main(String[] args) {
		Math m = new Math();
		m.addnum(20, 30);
		m.subnum(50, 25);
		m.divnum(25, 5);
		m.mulnum(5, 5);

	}

}
