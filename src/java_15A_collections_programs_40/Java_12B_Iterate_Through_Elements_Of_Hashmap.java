package java_15A_collections_programs_40;

import java.util.HashMap;
//Java program to demonstrate iteration over 
//Map using keySet() and values() methods
import java.util.Map;

public class Java_12B_Iterate_Through_Elements_Of_Hashmap {

	public static void main(String[] arg) {

		Map<String, String> m = new HashMap<String, String>();

		// enter name/url pair
		m.put("GFG", "geeksforgeeks.org");
		m.put("Practice", "practice.geeksforgeeks.org");
		m.put("Code", "code.geeksforgeeks.org");
		m.put("Quiz", "www.geeksforgeeks.org");

		// using keySet() for iteration over keys
		for (String name : m.keySet())
			System.out.println("key: " + name);

		// using values() for iteration over values
		for (String url : m.values())
			System.out.println("value: " + url);
	}
}
