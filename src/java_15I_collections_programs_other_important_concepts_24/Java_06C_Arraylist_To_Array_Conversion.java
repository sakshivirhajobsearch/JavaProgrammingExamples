package java_15I_collections_programs_other_important_concepts_24;

import java.util.ArrayList;
import java.util.List;

public class Java_06C_Arraylist_To_Array_Conversion {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Integer[] arr = new Integer[al.size()];
		arr = al.toArray(arr);

		for (Integer x : arr)
			System.out.print(x + " ");
	}
}
