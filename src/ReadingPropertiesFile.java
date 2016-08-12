import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
	
	public static void main (String args[]) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Roopa_Java\\properties.txt");
		prop.load(ip);
		System.out.println(prop.getProperty("Username"));
	}
}
