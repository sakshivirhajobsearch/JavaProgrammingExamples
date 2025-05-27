package java_15B_collections_programs_list_interface_42;

//Java code to illustrate AbstractList
import java.util.AbstractList;
import java.util.ArrayList;

public class Java_01A_Abstract_List_Class {

	public static void main(String args[]) {

		// Creating an empty AbstractList
		AbstractList<String> list = new ArrayList<String>();

		// Use add() method to add elements in the list
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("10");
		list.add("20");

		// Displaying the AbstractList
		System.out.println("AbstractList:" + list);
	}
}
