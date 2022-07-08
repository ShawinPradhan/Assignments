/*Write a program to calculate the marks and average of 5 subjects and calculate grade based on
 * certain condition
 * If avg >= 90 Grade A+
 * avg >= 80 Grade A
 * avg >= 60 Grade b
 * avg >= 40 Grade C
 * avg < 90 Grade D
 *  */

package basicpackage;

import java.util.Scanner;
public class RelationalOperatorDemo {

	public static void main(String[] args) {
		int m1,m2,m3,m4,m5,total,avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 marks: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		
		total = m1+m2+m3+m4+m5;
		avg = total/5;
		
		System.out.println("Total marks: "+total);
		System.out.println("Average: "+avg);
		
		if(avg>=90)
		System.out.println("Grade A+");
		
		else if(avg>=80)
		System.out.println("Grade A");
		
		else if(avg>=60)
		System.out.println("Grade B");
		
		else if(avg>=40)
		System.out.println("Grade C");
		
		else
		System.out.println("Grade D");
		
	}
}
