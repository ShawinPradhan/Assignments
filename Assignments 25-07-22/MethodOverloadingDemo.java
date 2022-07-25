package oopsdemo;
class Addition{
	public void add(int a)
	{
		System.out.println("Addition of one parameter: "+(a+10)); //if we use single bracket the compiler will take it as concatenation
		// thus we use two brackets to add
		System.out.println();
	}

public void add(int a,int b, int c) {
	System.out.println("Addition of three parameter: "+(a+b+c));
	System.out.println();
}

public void add(int a, double b ) {
	System.out.println("Addition of the parameter(int,double): "+(a+b));
	System.out.println();
}

public void add(double a, int b ) {
	System.out.println("Addition of the parameter(double,int): "+(a+b));
	System.out.println();
}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(12);
		a.add(15,76,54);
		a.add(56.23,89);
		a.add(76, 25.6);
	}

}
