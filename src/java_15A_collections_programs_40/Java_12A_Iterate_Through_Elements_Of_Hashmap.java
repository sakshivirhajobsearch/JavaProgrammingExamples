package java_15A_collections_programs_40;

import java.util.HashMap;
//Java program to demonstrate iteration over 
//Map.entrySet() entries using for-each loop
import java.util.Map;

public class Java_12A_Iterate_Through_Elements_Of_Hashmap {

	public static void main(String[] arg) {

		Map<String, String> m = new HashMap<String, String>();

		// enter name/url pair
		m.put("GFG", "geeksforgeeks.org");
		m.put("Practice", "practice.geeksforgeeks.org");
		m.put("Code", "code.geeksforgeeks.org");
		m.put("Quiz", "www.geeksforgeeks.org");

		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<String, String> i : m.entrySet())
			System.out.println("Key = " + i.getKey() + ", Value = " + i.getValue());
	}
}