package booksystem;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		BookService bservice = new BookService();
		
		do {
		System.out.println("Welcome to Book Management System");
		System.out.println("Press 1) Create Book Details\n"
				+ "Press 2) For getting book details by id\n"
				+ "Press 3) For getting all book details\n"
				+ "Press 4) Quit");
		System.out.println("================================");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			bservice.createBook();
			System.out.println();
			break;
		
		case 2:
			bservice.getBookDetailsById();
			System.out.println();
			break;
			
		case 3:
			bservice.getAllBookDetails();
			System.out.println();
			break;
			
		case 4:
			System.out.println("Thank you for visiting our book management.");
			System.out.println("Please, visit us again.");
			System.exit(0);
				
		}
		}while(choice == 4);

	}

}
