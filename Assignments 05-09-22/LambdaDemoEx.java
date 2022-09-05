package java8features;

import java.util.ArrayList;
interface runnable{
	void run();
}
public class LambdaDemoEx {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Shawin");
//		list.add("Nilanjan");
//		list.add("Pallab");
//		list.add("Randhir");
		
		// for each method is available from Java 8
//		list.forEach(				
//			(s)-> System.out.println(s)
//		);
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread is running");	
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
		
		//using lambda
		Runnable r2=()->
		{
			System.out.println("Thread2 is running");
		};
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
