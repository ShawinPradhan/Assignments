package collectionframework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hset= new HashSet<String>();
		
		System.out.println(hset.hashCode());
		
		hset.add("apple");
		hset.add("banana");
		hset.add("kiwi");
		hset.add("mango");
		hset.add("watermelon");
		hset.add(null);
		
		System.out.println(hset);
		hset.add("orange");
		
		Iterator it = hset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//creating an array
		System.out.println("Creating an array:");
		String array[]= new String[hset.size()];
		hset.toArray(array);
		for(String s:array)
		{
			System.out.println(s);
		}
		
		//creating an array list
		ArrayList<String> alist = new ArrayList<String>(hset);
		
		TreeSet<String> tset = new TreeSet<String>(hset);
		System.out.println(tset);
	}

}


