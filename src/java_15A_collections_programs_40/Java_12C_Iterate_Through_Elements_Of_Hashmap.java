package java_15A_collections_programs_40;

import java.util.HashMap;
import java.util.Iterator;
//Java program to demonstrate iteration over 
//Map using keySet() and values() methods
import java.util.Map;

public class Java_12C_Iterate_Through_Elements_Of_Hashmap {

	public static void main(String[] arg) {

		Map<String, String> m = new HashMap<String, String>();

		// enter name/url pair
		m.put("GFG", "geeksforgeeks.org");
		m.put("Practice", "practice.geeksforgeeks.org");
		m.put("Code", "code.geeksforgeeks.org");
		m.put("Quiz", "www.geeksforgeeks.org");

		// using iterators
		Iterator<Map.Entry<String, String>> i = m.entrySet().iterator();

		while (i.hasNext()) {
			Map.Entry<String, String> e = i.next();
			System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
		}
	}
}
