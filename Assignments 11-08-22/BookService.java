package booksystem;
import java.util.Scanner;
public class BookService {
	
	static Book book[] = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook()
	{
		System.out.println("Enter Book ID:");
		int id = sc.nextInt();
		
		sc.nextLine(); //it will consume the \n line
		
		System.out.println("Enter Book Name:");
		String bname = sc.nextLine();
		
		
		System.out.println("Enter Book Price:");
		double price = sc.nextDouble();
		
		
		book[index] = new Book(id, bname, price);
		index++;
		System.out.println("Book details created successfully!");
	}
	
	//get all book details
	public static void getAllBookDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book Id: "+book[i].getBookId());
			System.out.println("Book Name: "+book[i].getBookName());
			System.out.println("Book Price: "+book[i].getBookPrice());
			System.out.println("=========================");
		}
	}
	
	//get book details based on id
	public static void getBookDetailsById()
	{
		int i;
		boolean f = false;
		System.out.println("Enter Id to search the book:");
		int ids = sc.nextInt();
		for(i=0;i<index;i++)
		{
			if(ids==book[i].getBookId())
			{
				System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("=========================");
				f=true;
				break;
			}
			else
				if(f==false)
					System.out.println("Book Not Found!");
		}
	}
}
