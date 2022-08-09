package arrayexmaples;

public class StringDemo {

	public static void main(String[] args) {
		//concept of String literal
		//we use it mainly to save memory so that new memories are not created for the same string
		String name="Shawin";
		String name1="Shawin"; //it doesn't create a new instance
		String str="Welcome";
		//checking if name is same as name1 since its same the output will return true
		System.out.println(name==name1); 
		//checking if name is same as str since its different the output will return false
		System.out.println(name==str);
		//joining using concat function
		name = name.concat("Pradhan");
		System.out.println(name);
		
		System.out.println();
		String nam="Good Morning";
		//charAt(index) is used to return the char present at particular index(0 to n-1)
		int in=5;//index
		//char ch = name.charAt(5);
		char ch = nam.charAt(in); //returns the char value present at index(in)
		System.out.println(in+"th character: "+ch);

	}

}
