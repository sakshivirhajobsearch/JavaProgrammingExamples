package java_15I_collections_programs_other_important_concepts_24;

//Converting key or values into a 
//separate object using streams

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_04D_Conversion_Of_Java_Maps_To_List {

	public static void main(String[] args) {

		// Create a sample map
		Map<String, Integer> m = new HashMap<>();
		m.put("Geek1", 100);
		m.put("Geek2", 200);
		m.put("Geek3", 300);

		// Convert map keys to a list using Streams
		List<String> keysList = m.keySet().stream().collect(Collectors.toList());

		// Convert map values to a list using Streams
		List<Integer> valuesList = m.values().stream().collect(Collectors.toList());

		// Print the lists
		System.out.println("List of Keys using Streams: " + keysList);
		System.out.println("List of Values using Streams: " + valuesList);
	}
}
