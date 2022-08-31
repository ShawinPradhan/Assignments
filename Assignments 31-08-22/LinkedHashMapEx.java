package collectionframework;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>();
		lhmap.put("f1", "Apple");
		lhmap.put("f2", "Banana");
		lhmap.put("f3", "Carrot");
		
		System.out.println(lhmap);

	}

}
