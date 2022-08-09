//WAP to count no. of vowels present in a string 
// E.g. Good Morning
// No. of vowels = 4
package arrayexmaples;
import java.util.Scanner;

public class CountVowels {

	public static int countVowel(String str)
	{
		int i,count=0;
		char c;
		for(i=0;i<str.length();i++)
		{
			c = str.charAt(i);
			if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u') ||
					(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		st= sc.nextLine();
		System.out.println("No. of vowels in "+st+" : "+countVowel(st));

	}

}
