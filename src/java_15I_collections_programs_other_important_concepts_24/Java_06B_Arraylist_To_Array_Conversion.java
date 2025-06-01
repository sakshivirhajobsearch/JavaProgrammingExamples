package java_15I_collections_programs_other_important_concepts_24;

import java.util.ArrayList;
import java.util.List;

class Java_06B_Arraylist_To_Array_Conversion {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		// Error: incompatible types: Object[]
		// cannot be converted to Integer[]
		Integer[] objects = al.toArray();

		for (Integer obj : objects)
			System.out.println(obj);
	}
}