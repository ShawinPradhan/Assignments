package filestream;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("F:\\file\\letter.txt");
			int i;
			
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			System.out.println("No. of reamining bytes: "+fis.available());
			fis.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
