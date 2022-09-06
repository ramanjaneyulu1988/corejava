package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample1 {

	public static void main(String[] args) {
		
		File file = new File("E:/files/");
		String content = "This is a text file";
		FileWriter fw = null;
		try
		{
			fw = new FileWriter(file+"/test.txt");
			fw.write(content);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Done");
	}
}
