package filestream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("F:\\\\file\\\\letter.txt");
			//fis.write(55); //ASCII code
			String s ="Welcome to java stream";
			byte b[]=s.getBytes();
			
			fos.write(b);
			fos.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			
		}
	}

}
