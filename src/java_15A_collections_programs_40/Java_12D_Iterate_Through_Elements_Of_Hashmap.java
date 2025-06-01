package java_15A_collections_programs_40;

import java.util.HashMap;
//Java code illustrating iteration
//over map using forEach(action) method
import java.util.Map;

public class Java_12D_Iterate_Through_Elements_Of_Hashmap {

	public static void main(String[] arg) {

		Map<String, String> m = new HashMap<String, String>();

		// enter name/url pair
		m.put("GFG", "geeksforgeeks.org");
		m.put("Practice", "practice.geeksforgeeks.org");
		m.put("Code", "code.geeksforgeeks.org");
		m.put("Quiz", "www.geeksforgeeks.org");

		// forEach(action) method to iterate map
		m.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

	}
}