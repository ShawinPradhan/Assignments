package abstractiondemo;
import java.util.Scanner;

class RooftopPoolCafe{ //main class
	int resno; //reservation number
	String name; //name of person who reserved
	int people; // number of people attending
	final String cafe = "BIRD's VIEW"; //name of the roof top restaurant
	
	public RooftopPoolCafe(int resno, String name, int people) {
		super();
		this.resno = resno;
		this.name = name;
		this.people = people;
	}
	
	
}

interface Restraunt{ //hierarchical inheritance
	void menu();
}

interface Starter extends Restraunt{
	void smenu();
	void dessert();
}

interface Bar extends Restraunt{
	void barmen();
}

class Dine extends RooftopPoolCafe implements Bar,Starter{

	public Dine(int resno, String name, int people) {
		super(resno, name, people);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void menu() {
		System.out.println("Main Course:");
		System.out.println("1)Grilled Salmon with Dill Sauce "
				+ "\n2)Roast Mutton with Vegetable"
				+ "\n3)Chicken and Mushroom Pie");
		
	}

	@Override
	public void barmen() {
		System.out.println("Bar Menu:");
		System.out.println("1)Dirty Martini"
				+ "\n2)Bombay Saphire");
		
	}

	@Override
	public void smenu() {
		System.out.println("Starter Menu:");
		System.out.println("1)Spring Rolls "
				+ "\n2)French Onion Soup"
				+ "\n3)Caesar Salad");
		
	}

	@Override
	public void dessert() {
		System.out.println("Desserts:");
		System.out.println("1)Apple Pie with Cream "
				+ "\n2)Vanilla Ice Cream"
				+ "\n3)Blueberry Cheese Cake");
		
	}
	
}

class Party extends Dine{

	public Party(int resno, String name, int people) {
		super(resno, name, people);
		// TODO Auto-generated constructor stub
	} 
	
	void bar()
	{
		System.out.println("The bar is open for all till 11 PM.");
	}
	
	void display()
	{
		System.out.println();
		System.out.println(cafe);
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
		Party pt =new Party(r,na,n);
		int ch;
		String choice;
		do {
		System.out.println();
		System.out.println("What is your reservation for?  \n1)Party   2)Dine");
		choice = sc.next();
		if(choice.equalsIgnoreCase("Party"))
		{
			System.out.println("The whole place has been reserved by: "+na);
			System.out.println("Please choose which menu:  \n1)Main Course   2)Starter Menu  "
					+ "3)Bar  4)Dessert  5)Bill/Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				pt.menu();
				pt.display();
				break;
			case 2:
				pt.smenu();
				pt.display();
				break;
			case 3:
				pt.bar();
				pt.display();
				break;
			case 4:
				pt.dessert();
				pt.display();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Sorry our restaurant has been reserved for today!");
			}
		}
		else if(choice.equalsIgnoreCase("Dine"))
		{
			System.out.println("Please choose which menu:  \n1)Main Menu   2)Starter Menu  "
					+ "3)Bar  4)Dessert  5)Bill/Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				pt.menu();
				pt.display();
				break;
			case 2:
				pt.smenu();
				pt.display();
				break;
			case 3:
				pt.barmen();
				pt.display();
				break;
			case 4:
				pt.dessert();
				pt.display();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Wrong Choice!!");
			}
		}
		else
			System.out.println("Sorry, We are full!!");
		
		}while(true);
	}

}
