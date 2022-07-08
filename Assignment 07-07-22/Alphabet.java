/*Write a program to check whether a character is a alphabet or not*/

package basicpackage;

public class Alphabet {

	public static void main(String[] args) {
		char c ='x';
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) // && logical AND (meaning both condition has to be true) - || logical OR
			System.out.println(c+" is an Alphabet");
		else
			System.out.println(c+" is not an Alphabet");

	}

}
