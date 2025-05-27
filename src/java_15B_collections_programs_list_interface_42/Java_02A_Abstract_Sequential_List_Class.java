package java_15B_collections_programs_list_interface_42;

//Java code to illustrate AbstractSequentialList
import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class Java_02A_Abstract_Sequential_List_Class {

	public static void main(String[] args) {
		// Creating an instance of AbstractSequentialList
		AbstractSequentialList<Integer> a = new LinkedList<>();

		// adding elements
		a.add(5);
		a.add(6);
		a.add(7);

		// Printing the list
		System.out.println(a);
	}
}