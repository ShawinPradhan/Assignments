//WAP to count the number of occurrence of a char
//Eg. Good Morning 
//char = o;
//occurrence =3
package arrayexmaples;
import java.util.Scanner;
public class Occurrence {
	public static int CountOcc(String str,char c)
	{
		int i, count =0;
		for(i=0;i<str.length();i++)
		{
			if(c==str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch;
		System.out.println("Enter a string: ");
		ch = sc.nextLine();
		System.out.println("Enter which occurence to find:");
		char a =sc.next().charAt(0);
		System.out.println("No. of occurence of "+a+" is: "+CountOcc(ch,a)+" times");
		

	}

}
