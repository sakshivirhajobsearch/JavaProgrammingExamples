package java_15I_collections_programs_other_important_concepts_24;

//Java Program to demonstrates 
//the working of keySet()

import java.util.ArrayList;
import java.util.HashMap;

public class Java_01A_How_To_Convert_HashMap_To_Arraylist {

	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap<>();
		m.put("Geek1", 100);
		m.put("Geek2", 200);
		m.put("Geek3", 300);

		ArrayList<String> al = new ArrayList<>(m.keySet());
		System.out.println("Keys: " + al);
	}
}