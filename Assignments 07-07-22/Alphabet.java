/*Write a program to check whether a character is a alphabet or not*/

public class Alphabet {

	public static void main(String[] args) {
		char c ='x';
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			System.out.println(c+" is a Alphabet");
		else
			System.out.println(c+" is not a Alphabet");

	}

}
