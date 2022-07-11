package basicpackage;
import java.util.Scanner; // import Scanner to scan a number

public class MultiplicationTable {

	public static void main(String[] args) {
		int number, i, result; // i is a counter variable, number is used to store whose table we are find and result is to store the multiplication
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in); //Declaring an object for scanner
		number = sc.nextInt(); //storing the number in the variable number
		for(i=1;i<=12;i++) //using for loop taking starting step as 1 and checking whether the number <= 12 then incrementing by 1
		{
			result = number *i;//multiplying the number with i as it is incrementing and storing in result
			System.out.println(number+" * "+i+ " = " +result);
		}
		}

}
