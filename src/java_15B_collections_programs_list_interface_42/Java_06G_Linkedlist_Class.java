package java_15B_collections_programs_list_interface_42;

import java.util.LinkedList;

public class Java_06G_Linkedlist_Class {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(123);
		list.add(12);
		list.add(11);
		list.add(1134);
		System.out.println("LinkedList: " + list);
		Object[] a = list.toArray();
		System.out.print("After converted LinkedList to Array: ");
		for (Object element : a)
			System.out.print(element + " ");
	}
}
