import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWritingFromFile {
	
	public static void main(String args[]) throws IOException
	{
		File f = new File("D:\\Roopa_Java\\properties.txt");
		f.createNewFile();
		
		FileWriter w = new FileWriter("D:\\Roopa_Java\\properties.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("Name     : Roopa");
		out.newLine();
		out.write("Username : Roopa3474");
		out.flush();
		
		FileReader r = new FileReader("D:\\Roopa_Java\\properties.txt");
		BufferedReader bfr = new BufferedReader(r);
		//System.out.println(bfr.readLine());
		String x="";
		while((x = bfr.readLine()) !=null)
		{
			System.out.println(x.substring(11));
		}
	}

}
