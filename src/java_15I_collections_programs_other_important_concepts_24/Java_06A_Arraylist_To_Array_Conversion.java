package java_15I_collections_programs_other_important_concepts_24;

import java.util.ArrayList;
import java.util.List;

public class Java_06A_Arraylist_To_Array_Conversion {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] objects = al.toArray();

		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + " ");
	}
}
