package Day2.Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException
	{
		URL resource = FileReaderDemo.class.getResource("Hee.txt");
		if(resource == null)
		{
			System.err.println("File not Found");
			return;
		}
		
		File file = new File(resource.getFile());
		
		FileReader filereader = new FileReader(file);
		
		BufferedReader reader = new BufferedReader(filereader);
		
		String line;
		
		while((line = reader.readLine())!= null) {
			System.out.println(line);
		}
		reader.close();
	}
}
