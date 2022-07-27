package abstractiondemo;
import java.util.Scanner;

abstract class Vaccine{
	String citizen,c_name;
	int age,amount;
	public void setData(String citizen, int age,int amount,String c_name) {
		this.citizen=citizen;
		this.age=age;
		this.amount=amount;
		this.c_name=c_name;
	}
	
	
	public void firstDose(String citizen,int age, int amount) {
		if((citizen.equals("Indian")||citizen.equals("INDIAN"))&&(age>=18))
		{
			System.out.println("Eligible to receive 1st Dose.");
			System.out.println();
			if(amount==250)
			{
				System.out.println("Payment Successful.");
				System.out.println();
			}
			else
				System.out.println("Wrong amount.");
		}
		else
			System.out.println("Not elibile for vaccination.");
		
	}
	
	public void secondDose(int choice) {
		
		if(choice==1)
		{
		System.out.println("Eligible for 2nd Dose.");
		System.out.println();
		}
		else if(choice==2)
			System.out.println("Not eligble.");
		else
			System.exit(0);
	}
	public void report(String c_name, String citizen, int age) {
		System.out.println("REPORT");
		System.out.println("Name: "+c_name);
		System.out.println("Citizenship: "+citizen);
		System.out.println("Age: "+age);
		System.out.println("Status: Vaccinated.");
	}
	
	
	abstract public void boosterDose(int choice);
}

class vaccinationSuccessful extends Vaccine{

	@Override
	public void boosterDose(int choice) {
		if(choice==1) {
			System.out.println("Eligible for booster.");
			System.out.println("Vaccination Successful!!");
			}
		else
			System.out.println("Not elibile for the booster.");
	}
}
public class Vaccination {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		int price, a,ch;
		String c,name;
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter citizenship: ");
		c=sc.next();
		System.out.println("Enter Age: ");
		a= sc.nextInt();
		System.out.println("Enter the amount to pay: ");
		price= sc.nextInt();
		vaccinationSuccessful vs = new vaccinationSuccessful();
		vs.firstDose(c,a,price);
		System.out.println();
		System.out.println("Check eligibility for 2nd Dose.");
		System.out.println("Have you received 1st Dose: \n1)Yes 2)No" );
		ch =sc.nextInt();
		vs.secondDose(ch);
		System.out.println();
		System.out.println("Check if eligible for booster: ");
		System.out.println("Received both doses? 1)Yes  2)No");
		ch=sc.nextInt();
		vs.boosterDose(ch);
		System.out.println();
		vs.report(name,c,a);
	}

}
