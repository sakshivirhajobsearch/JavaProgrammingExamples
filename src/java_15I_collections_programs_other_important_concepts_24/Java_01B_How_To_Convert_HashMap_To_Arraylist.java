package java_15I_collections_programs_other_important_concepts_24;

//Java Prpgram to demonstrates the working of values()

import java.util.ArrayList;
import java.util.HashMap;

public class Java_01B_How_To_Convert_HashMap_To_Arraylist {

	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap<>();
		m.put("Geek1", 100);
		m.put("Geek2", 200);
		m.put("Geek3", 300);

		ArrayList<Integer> al = new ArrayList<>(m.values());
		System.out.println("Values: " + al);
	}
}