package abstractiondemo;
import java.util.Scanner;

class RooftopPoolCafe{
	int resno; //reservation number
	String name; //name of person who reserved
	int people; // number of people attending
	final String cafe = "Bird's View"; //name of the roof top restaurant
	
	public RooftopPoolCafe(int resno, String name, int people) {
		super();
		this.resno = resno;
		this.name = name;
		this.people = people;
	}
	
	
}

interface Restraunt{
	void menu();
}

interface Starter extends Restraunt{
	void smenu();
}

interface Bar extends Restraunt{
	void barmen();
}

class Party extends RooftopPoolCafe implements Bar,Starter{

	public Party(int resno, String name, int people) {
		super(resno, name, people);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void menu() {
		System.out.println("This is the Main menu.");
		
	}

	@Override
	public void barmen() {
		System.out.println("This is the Bar menu.");
		
	}

	@Override
	public void smenu() {
		System.out.println("This is the Starter menu.");
		
	}
	
	void bar()
	{
		System.out.println("The bar is open for all till 11 PM.");
	}
	
}

class Regular extends Party{

	public Regular(int resno, String name, int people) {
		super(resno, name, people);
		// TODO Auto-generated constructor stub
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Reservation no.: "+resno);
		System.out.println("Name: "+name);
		System.out.println("No. of people attending: "+people);
	}
	
}
public class RestaurantWork {

	public static void main(String[] args) {
		int r,n;
		String na;
		Scanner sc = new Scanner(System.in);
		System.out.println("Reservation No: ");
		r = sc.nextInt();
		System.out.println("No. of people attending: ");
		n  = sc.nextInt();
		System.out.println("Name of person who reserved: ");
		na = sc.next();
		Regular reg =new Regular(r,na,n);
		/*reg.menu();
		reg.display();
		*/
		int ch;
		String choice;
		System.out.println("What is your reservation for?  \n1)Party   2)Regular");
		choice = sc.next();
		if(choice.equalsIgnoreCase("Party"))
		{
			System.out.println("The whole place has been reserved by: "+na);
			System.out.println("Please choose which menu:  \n1)Main Menu   2)Starter Menu  "
					+ "3)Bar  4)Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				reg.menu();
				reg.display();
				break;
			case 2:
				reg.smenu();
				reg.display();
				break;
			case 3:
				reg.bar();
				reg.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Sorry our restaurant has been reserved for today!");
			}
		}
		else if(choice.equalsIgnoreCase("Regular"))
		{
			System.out.println("Please choose which menu:  \n1)Main Menu   2)Starter Menu  "
					+ "3)Bar  4)Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				reg.menu();
				reg.display();
				break;
			case 2:
				reg.smenu();
				reg.display();
				break;
			case 3:
				reg.barmen();
				reg.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Choice!!");
			}
		}
		else
			System.out.println("Sorry, We are full!!");
		

	}

}
