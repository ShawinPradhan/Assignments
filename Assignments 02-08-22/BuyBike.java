/*Write a program to implement below scenario:
Create a Bike class having properties like engine, wheel, name and methods like 
start move break stop.
Create two subclass of bikes and create the bike object as per user requirement (input). 
If that particular type of bike is available assign that bike to a rider.
Rider should have name and license number and rider will ride the bike.
Display all the details including Car Engine details wheel details along with rider details.
And also all the behavior*/

package abstractiondemo;
import java.util.Scanner;
class Bike1{
	final int wheel=2;
	int engine;
	String namel;
	int ch;

}

class Types extends Bike1{
	Scanner sc=new Scanner(System.in);
	void sport()
	{
		System.out.println("Which type of engine? \n1)Under 250cc  2)Under 400cc ");
		engine = sc.nextInt();
		if(engine==250)
		{
			System.out.println("Which company you are looking for?  \n1)Pulsar  2)Suzuki  3)KTM");
			ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Pulsar RS 200");
				System.out.println("Engine: 200cc");
				System.out.println("Company: Bajaj");
				System.out.println("No. of wheels: "+wheel);
				break;
			case 2:
				System.out.println("Gixxer SF 250");
				System.out.println("Engine: 250cc");
				System.out.println("Company: Suzuki");
				System.out.println("No. of wheels: "+wheel);
				break;
			case 3:
				System.out.println("RC 200");
				System.out.println("Engine: 200cc");
				System.out.println("Company: KTM");
				System.out.println("No. of wheels: "+wheel);
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}
		else if(engine==400)
		{
			System.out.println("Which company you are looking for?  \n1)KTM  2)TVS ");
			ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("RC 390");
				System.out.println("Engine: 390cc");
				System.out.println("Company: KTM");
				System.out.println("No. of wheels: "+wheel);
				break;
			case 2:
				System.out.println("Apache RR310");
				System.out.println("Engine: 310cc");
				System.out.println("Company: TVS");
				System.out.println("No. of wheels: "+wheel);
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}
		else
			System.out.println("Wrong Input!!");
	}
	
	void cruiser()
	{
		System.out.println("Which company you're looking for?  \n1)Royal Enfield  2)Jawa  3)Honda");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Classic");
			System.out.println("Engine: 350cc");
			System.out.println("Company: Royal Enfield");
			System.out.println("No. of wheels: "+wheel);
			break;
		case 2:
			System.out.println("Perak");
			System.out.println("Engine: 350cc");
			System.out.println("Company: JAWA");
			System.out.println("No. of wheels: "+wheel);
			break;
		case 3:
			System.out.println("H'Ness");
			System.out.println("Engine: 350cc");
			System.out.println("Company: Honda");
			System.out.println("No. of wheels: "+wheel);
			break;
		default:
			System.out.println("Wrong Choice!!");
		}
	}

	void adv()
	{
		System.out.println("Which company you're looking for?  \n1)Royal Enfield  2)Hero  3)BMW");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Himalayan");
			System.out.println("Engine: 400cc");
			System.out.println("Company: Royal Enfield");
			System.out.println("No. of wheels: "+wheel);
			break;
		case 2:
			System.out.println("Impulse");
			System.out.println("Engine: 150cc");
			System.out.println("Company: Hero");
			System.out.println("No. of wheels: "+wheel);
			break;
		case 3:
			System.out.println("G310 GS");
			System.out.println("Engine: 310cc");
			System.out.println("Company: BMW");
			System.out.println("No. of wheels: "+wheel);
			break;
		default:
			System.out.println("Wrong Choice!!");
		}
	}
	
	
}

class Customer extends Types{
	String c_name;
	int licno;
	Scanner sc= new Scanner(System.in);
	void custName()
	{
		System.out.println("Enter your name: ");
		c_name = sc.nextLine();
	}
	
	void licNumber()
	{
		System.out.println("Enter License no.: ");
		licno=sc.nextInt();
	}
}



public class BuyBike {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,lic;
		String nam;
		Customer cs= new Customer();
		cs.custName();
		cs.licNumber();
		do {
			System.out.println("Welcome to the Dealership");
			System.out.println("Which type of bike you're looking for?");
			System.out.println("1)Sports  2)Cruiser  3)Adventure  4)Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				cs.sport();
				System.out.println();
				break;
			case 2:
				cs.cruiser();
				System.out.println();
				break;
			case 3:
				cs.adv();
				System.out.println();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Input!!");
			}
		
	}while(true);
	
	}
}
