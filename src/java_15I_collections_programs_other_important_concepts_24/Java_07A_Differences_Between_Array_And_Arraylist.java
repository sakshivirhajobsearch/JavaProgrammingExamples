package java_15I_collections_programs_other_important_concepts_24;

//Java program to demonstrate differences between
//Array and ArrayList

//Importing required classes
import java.util.ArrayList;

//Main class
public class Java_07A_Differences_Between_Array_And_Arraylist {

	// Main driver method
	public static void main(String args[]) {

		// Input array
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;

		// Printing first element of array
		System.out.println(arr[0]);

		// ArrayList
		// Creating an arrayList with
		// initial capacity say bi it 2
		ArrayList<Integer> al = new ArrayList<Integer>(2);

		// Adding elements to ArrayList
		// using add() method
		al.add(1);
		al.add(2);

		// Printing alongside accessing
		// elements of ArrayList
		System.out.println(al.get(0));
	}
}