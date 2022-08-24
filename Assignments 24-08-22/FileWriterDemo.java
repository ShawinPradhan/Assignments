package filestream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		//write in a file
		try {
			FileWriter fw= new FileWriter("F:\\file\\letter.txt");
			fw.write("We are learning file writer.");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//read from a file
		try {
			FileReader fr = new FileReader("F:\\file\\letter.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println("Success!!");
	}

}
