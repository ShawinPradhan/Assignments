package filestream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		FileInputStream fs =null;
		FileOutputStream os = null;
		
		try
		{
			fs = new FileInputStream("F:\\file\\letter.txt");
			os = new FileOutputStream("F:\\file\\copy.txt");
			
			int i;
			
			while((i=fs.read())!=-1)
			{
				os.write(i);
			}
			
			System.out.println("File copied successfully.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		finally {
			try {
				if(fs!=null)
					fs.close();
				if(os!=null)
					os.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}

}
