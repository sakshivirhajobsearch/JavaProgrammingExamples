package java_15B_collections_programs_list_interface_31;

//Java code to illustrate 
//methods of AbstractCollection 
import java.util.AbstractList;
import java.util.LinkedList;

public class Java_01B_Abstract_List_Class {

	public static void main(String args[]) {

		// Creating an empty AbstractList
		AbstractList<String> list = new LinkedList<String>();

		// Using add() method to add elements in the list
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("10");
		list.add("20");

		// Output the list
		System.out.println("AbstractList: " + list);

		// Remove the head using remove()
		list.remove(3);

		// Print the final list
		System.out.println("Final AbstractList: " + list);

		// getting the index of last occurrence
		// using lastIndexOf() method
		int lastindex = list.lastIndexOf("A");

		// printing the Index
		System.out.println("Last index of A : " + lastindex);
	}
}