package collectionframework;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object using polymorphism
		List<Integer>list=new ArrayList<Integer>();
	list.add(34);
	list.add(56);
	list.add(45);
	list.add(34);
	System.out.println(list);
	System.out.println(list.size());
	list.add(77);
	list.add(99);
	
	System.out.println(list);
	System.out.println(list.size());
	list.remove(3);
	System.out.println(list);
	System.out.println(list.size());
	//use for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//using for each loop iterate arraylist
		System.out.println("for each loop iterate arraylist");
		for(Integer in: list)
		{
			System.out.println(in);
		}
		//Using While loop
		int count=0;
		while(count<list.size())
		{
			System.out.println(list.get(count));
			count++;
		}
		System.out.println("iterate using iterator");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//sort arraylist ascending
		Collections.sort(list);
		System.out.println("after sorting the values");
		System.out.println(list);
		//sort array list desending
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		list.add(2,100);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		//copy array list
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.addAll(list);
		System.out.println("Copied list: "+list1);
		//sort sublist
		List<Integer> sublist1=list.subList(2, 4);
		System.out.println(sublist1);
		//another way
		ArrayList<Integer>sublist2=new ArrayList<Integer>(list.subList(0, 4));
		System.out.println(sublist2);
		//search elements
		System.out.println(list.contains(34));
	}
	

}
