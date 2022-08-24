package multithreading;

public class TestGarbageCollection {
public void finalize()
{
	System.out.println("All objects are collected for garbage collection.");
}
	public static void main(String[] args) {
		TestGarbageCollection t1 = new TestGarbageCollection();
		TestGarbageCollection t2 = new TestGarbageCollection();
		t1=null; //setting it to null or we can say we are null referencing
		t2=null;
		System.gc();
		System.out.println("All are unreferenced.");
	}

}
