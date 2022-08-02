package abstractiondemo;

class Bike{
	final void speed() //any method declared as final cannot be changed or updated/ override
	{
		System.out.println("Speed: 160km/hr");
	}
}
// we can inherit a class containing final method but the value cannot be changed
public class FinalKeywordDemo extends Bike{ //inheriting Bike class
	//final variable
	final int a =100; //if we make any variable final we cannot change the value later on
	
	public static void main(String[] args) {
		FinalKeywordDemo demo = new FinalKeywordDemo();
		//demo.a = 50; //The final field FinalKeywordDemo.a cannot be assigned
		System.out.println("Value of a: "+demo.a);
		demo.speed(); //printing the final method
		
		
	}

}
