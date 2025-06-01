package java_15I_collections_programs_other_important_concepts_24;

//Converting the keys into a list

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java_04A_Conversion_Of_Java_Maps_To_List {

	public static void main(String[] args) {

		// Create a sample map
		Map<String, Integer> m = new HashMap<>();
		m.put("Geek1", 1);
		m.put("Geek2", 2);
		m.put("Geek3", 3);

		// Convert map keys to a list
		List<String> l = new ArrayList<>(m.keySet());

		// Print the list of keys
		System.out.println("List of Keys: " + l);
	}
}
