package java_15E_collections_programs_set_interface_39;

//Java program to Adding Elements to HashSet
import java.util.HashSet;

public class Java_05B_HashSet_Class {

	public static void main(String[] args) {

		// Creating an empty HashSet of string entities
		HashSet<String> hs = new HashSet<String>();

		// Adding elements using add() method
		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");

		// Printing all string entries inside the Set
		System.out.println("HashSet : " + hs);
	}
}