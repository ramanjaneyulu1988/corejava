package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample5 {

	public static void main(String[] args) throws IOException {

		File file = new File("E:/files/");
		FileReader fr = new FileReader(file+"/employee.json");
		BufferedReader br = new BufferedReader(fr);

		String content = "";
		while((content = br.readLine()) != null)
		{
			System.out.println(content);
		}
	}
}
