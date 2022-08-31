package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(111, "Shawin");
		hmap.put(154, "Richesh");
		hmap.put(123, "Priya");
		hmap.put(112, "Ayeshna");
		
		System.out.println(hmap);
		
		//Set set = hmap.entrySet();
		//Iterator itr = set.iterator();
		
		Iterator itr = hmap.entrySet().iterator();
		
		//Map.Entry interface provides certain methods to access the entry in the
		//Map.by gaining access to the entry of the Map we can easily manipulate
        // them. Map.Entry is generic and depend on java.util package
		
		while(itr.hasNext())
		{
			Map.Entry mentry =(Map.Entry)itr.next();
			System.out.println("Key: "+ mentry.getKey());
			System.out.println("value: "+mentry.getValue());
		}
		
		//get values based on key
		String val = hmap.get(112);
		System.out.println("Value mapped with Key: "+val);
		
		//removes values based on key
		System.out.println("Removing using key: "+hmap.remove(154));  	
		
		System.out.println();
		System.out.println("After removing key 154:");
		//printing using for each loop
		for(Map.Entry me:hmap.entrySet())
		{
			System.out.println("Key: "+ me.getKey());
			System.out.println("value: "+me.getValue());
		}
		
		System.out.println();
		//sorting Hash Map using key
		Map<Integer, String> tmap = new TreeMap<Integer, String>(hmap);
		
		System.out.println("After sorting:");
		for(Map.Entry me:tmap.entrySet())
		{
			System.out.println("Key: "+ me.getKey());
			System.out.println("value: "+me.getValue());
		}
		
		System.out.println();
		//checking size of hash map
		System.out.println("Size of hash map: "+hmap.size());
		//checking size of tree map
		System.out.println("Size of tree map: "+tmap.size());
		
		//to clear- clear() or to check if empty isEmpty()
		
		System.out.println();
		//check key existence
		System.out.println("Key present: "+hmap.containsKey(111));
		
		//check value existence
		System.out.println("Value present: "+hmap.containsValue("Richesh"));
		
		
	}

}
