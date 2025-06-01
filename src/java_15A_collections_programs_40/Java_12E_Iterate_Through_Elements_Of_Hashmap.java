package java_15A_collections_programs_40;

import java.util.HashMap;
//Java program to demonstrate iteration
//over keys and searching for values
import java.util.Map;

public class Java_12E_Iterate_Through_Elements_Of_Hashmap {

	public static void main(String[] arg) {

		Map<String, String> m = new HashMap<String, String>();

		// enter name/url pair
		m.put("GFG", "geeksforgeeks.org");
		m.put("Practice", "practice.geeksforgeeks.org");
		m.put("Code", "code.geeksforgeeks.org");
		m.put("Quiz", "www.geeksforgeeks.org");

		// looping over keys
		for (String i : m.keySet()) {
			// search for value
			String url = m.get(i);
			System.out.println("Key = " + i + ", Value = " + url);
		}
	}
}