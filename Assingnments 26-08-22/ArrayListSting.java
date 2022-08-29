package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> as=new ArrayList<String>();
		ArrayList<String> as1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the Strings: ");
		for(int i=0;i<5;i++)
		{
			
			str=sc.next();
			as.add(str);
		}
		System.out.println("Strings are: ");
		/*for(int i=0;i<as.size();i++)
		{
			System.out.println(as.get(i));
		}*/
		System.out.println(as);
		//ascending order
		Collections.sort(as);
		System.out.println("After sorting ascending: ");
		System.out.println(as);
		//Descending order
		Collections.sort(as,Collections.reverseOrder());
		System.out.println("After sorting Descending: ");
		System.out.println(as);
		// to add any value
		System.out.println("after adding a string: ");
		as.add(2,"guava");
		System.out.println(as);
		// to remove any value
		System.out.println("after remove a string: ");
		as.remove(0);
		System.out.println(as);
		//copy array list
		System.out.println("After copy");
		as1.addAll(as);
		System.out.println(as1);
		//converting arraylist into array
		String arr[]=new String[as.size()];
		for(int i=0;i<as.size();i++)
		{
			arr[i]=as.get(i);
		}
		for(int i=0;i<as.size();i++)
		{
			System.out.println(arr[i]);
		}
		//convert array to arraylist
		String name[]= {"Nilanjan","Pallab","Chandan","Shawin"};
		ArrayList<String> alist=new ArrayList<String>(Arrays.asList(name));
		//can add new elemnts also
		alist.add("Shaquib");
		alist.add("islam");
		System.out.println("After converting");
		for (String str1: alist)
		{
			System.out.println(str1);
		}
		//replace the string
		as.set(2, "Kiwi");
		System.out.println(as);
		as.clear();
	}

}
