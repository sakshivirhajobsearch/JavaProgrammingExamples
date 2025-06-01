package java_15G_collections_programs_map_interface_89;

import java.io.FileReader;
//Java program to demonstrate Properties class to get
//information from the properties file

import java.util.Properties;

public class Java_12A_Properties_Class {

	public static void main(String[] args) throws Exception {

		// create a reader object on the properties file
		FileReader reader = new FileReader("db.properties");

		// create properties object
		Properties p = new Properties();

		// Add a wrapper around reader object
		p.load(reader);

		// access properties data
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}