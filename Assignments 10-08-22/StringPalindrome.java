//WAP to check whether a string is palindrome or not
package arrayexmaples;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,rev = "";
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome or not?");
		str= sc.nextLine();
		for(i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println();
		if(str.equalsIgnoreCase(rev))
		{	
			System.out.println(str+" is a palindrome.");
			System.out.println(str+" = "+rev);
		}
		else
		{
			System.out.println(str+" is not a plaindrome.");
			System.out.println(str+" != "+rev);
		}
	}

}
