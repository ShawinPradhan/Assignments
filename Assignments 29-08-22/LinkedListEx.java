package collectionframework;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		//polymorphic object
		LinkedList<String> names = new LinkedList<String>();
		
		//LinkedList<Integer> llist = new LinkedList<Integer>();
		
		names.add("Shawin");
		names.add("Nilanjan");
		names.add("Richesh");
		names.add("Pallab");
		
		System.out.println(names);

		System.out.println();
		
		for(String s:names)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Using while loop");
		int count=0;
		while(count<names.size())
		{
			System.out.println(names.get(count));
			count++;
		}
		
		System.out.println();
		System.out.println("Using iterator");
		Iterator itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Performing adding operations:");
		//adding operations
		names.addFirst("First"); //adding at first position
		names.addLast("Last"); //adding at last position
		names.add(2, "Priya"); //adding at index 2
		System.out.println(names);
		
		System.out.println();
		System.out.println("Performing removing operations:");
		//remove operations
		names.removeFirst(); // removing the first element
		names.removeLast(); // removing the last element
		names.remove(2); // removing from index 2
		names.remove("Richesh"); // removing using the string
		System.out.println(names);
		
		System.out.println();
		//set and get data
		names.set(0, "Shawin Pradhan"); //updating using set
		String name = names.get(0); //fetching the updated data using get
		System.out.println(name); //printing the updated data
		System.out.println(names);
		
		//names.clear(); //it clears the linked list and makes it empty
		//System.out.println(names);
		
		//list iterator
		ListIterator listit= names.listIterator();
		System.out.println("Forward direction:");
		while(listit.hasNext()) 
		{
			System.out.println(listit.next());
		}
		
		System.out.println();
		System.out.println("Backward direction:");
		while(listit.hasPrevious()) //reverse direction
		{
			System.out.println(listit.previous());
		}
		
		System.out.println();
		//we can also reverse the linked list using descending Iterator
		//Returns an iterator over the elements in this deque 
		//in reverse sequential order. The elements will be returned 
		//in order from last (tail) to first (head).
		System.out.println("Printing in reverse using Iterator-descending iterator:");
		Iterator it = names.descendingIterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println();
		//checking the contents using if loop with contains keyword
		if(names.contains("Shawin Pradhan"))
		{
			System.out.println("Data present.");
		}
		else 
			System.out.println("Data not present.");
		
		names.add("Rahul");
		System.out.println(names);
		System.out.println("Last index of nill :"+names.lastIndexOf("Rahul"));
		
		//adding the elements using push keyword
		// push inserts elements at first of the list
		names.push("Chayan");
		names.push("Amit");
		
		System.out.println(names);
		
		//remove and return the first element of the list
		System.out.println("Elements popped: "+names.pop());
		System.out.println(names);
		
		System.out.println();
		//poll method retrieves and removes the head(first) element
		System.out.println("Element popped: "+names.poll());
		System.out.println(names);
		
		//pollFirst - retrieves and removes the first element
		// returns null if the list is empty
		System.out.println("Element popped: "+names.pollFirst());
		System.out.println(names);
		
		//pollLast - retrieves and removes the last element
		// returns null if the list is empty
		System.out.println("Element popped: "+names.pollLast());
		System.out.println(names);
		
		//convert linked list to array list
		List<String> list = new ArrayList<String>(names);
		System.out.println("Converting linked list to array list:");
		for(String str: list)
		{
			System.out.println(str);
		}
		
		System.out.println();
		//convert linked list to array
		String [] array = names.toArray(new String[names.size()]);
		System.out.println("Converting linked list to array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
