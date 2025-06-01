package java_15G_collections_programs_map_interface_89;

import java.io.FileWriter;
//Java program to demonstrate Properties class to create
//the properties file

import java.util.Properties;

public class Java_12C_Properties_Class {

	public static void main(String[] args) throws Exception {

		// create an instance of Properties
		Properties p = new Properties();

		// add properties to it
		p.setProperty("name", "Ganesh Chowdhary Sadanala");
		p.setProperty("email", "ganeshs.gfg@gmail.com");

		// store the properties to a file
		p.store(new FileWriter("info.properties"), "GeeksforGeeks Properties Example");
	}
}