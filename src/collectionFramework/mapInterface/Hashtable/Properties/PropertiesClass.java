package collectionFramework.mapInterface.Hashtable.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClass {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("Details.properties");
		
		// Loaded the properties file
		p.load(fis);
		
		//Retrieving the property values using property Names
		System.out.println(p.getProperty("Username")); // Arun
		System.out.println(p.getProperty("Password")); // 1234
		
//		Enumeration e = p.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		System.out.println(p);
		p.setProperty("Username", "Arun");
		System.out.println(p);
//		
//		String username = p.getProperty("Arun");
//		String password = p.getProperty("1234");
//		
//		System.out.println("Login to the application using username "+username+" and password "+password);
		
	}

}
