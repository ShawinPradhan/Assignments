package abstractiondemo;

interface LibraryUser{ //interface class
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser{ //Kid User class implementing LibraryUser
	int age;
	String bookType;
	
	//generating constructor using fields
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	//getter setter method
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		
		if(getAge()<12)//checking if age is less than 12 or not
			System.out.println("You have successfully registered under a Kids Account.");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid.");
	}

	@Override
	public void requestBook() {
		if(getAge()<12 && getBookType() == "kids") //checking the age as well as the book type
		{
			System.out.println("Book Issued successfully,please return the book within 10 days.");
		}
		else
			System.out.println("Oops, you are allowed to take only kids books.");
	}	
}

class AdultUser implements LibraryUser{
	int age;
	String bookType;
	
	
	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account.");
		else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
	}

	@Override
	public void requestBook() {
		if(getAge()>12 && getBookType() == "fiction")
		{
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		}
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
	}
	
}
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kd1= new KidUsers(10,"kids");//declaring object for KidUsers
		kd1.registerAccount();
		kd1.requestBook();
		System.out.println();
		
		KidUsers kd2= new KidUsers(18,"fiction");
		kd2.registerAccount();
		kd2.requestBook();
		System.out.println();
		
		
		AdultUser ad1 = new AdultUser(5,"kids");//declaring objects for AdultUser
		ad1.registerAccount();
		ad1.requestBook();
		System.out.println();
		
		AdultUser ad2 = new AdultUser(23,"fiction");
		ad2.registerAccount();
		ad2.requestBook();

	}

}
