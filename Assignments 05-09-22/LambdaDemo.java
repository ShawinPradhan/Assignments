package java8features;

interface sayable{
	//String msg(String message);
	
	int addition(int a,int b);
}
public class LambdaDemo {

	public static void main(String[] args) {
		//without lambda expression
		/*sayable s= new Sayable(){
		 * 
		 * @Override
		 * public void msg()
		 * {
		 * 	System.out.println("Hello Java);
		 * }
		 * };
		 * s.msg();
		*/
		
		
		//with lambda expression
		//sayable s = () -> System.out.println("HEllo Java");
		
//		sayable s= () ->
//		{
//			return "We are learning Lambda";
//		};
//		System.out.println(s.msg()); 
		
		sayable s1 =(a,b)->(a+b);
		System.out.println("Additon: "+s1.addition(10, 20));
		
		sayable s2=(int a,int b)->(a+b);
		System.out.println("Additon: "+s1.addition(50, 50));
		
		//with return type
		sayable s3=(a,b)->
		{
			return(a+b);
		};
		System.out.println("Additon: "+s3.addition(500, 500));
	}

}
