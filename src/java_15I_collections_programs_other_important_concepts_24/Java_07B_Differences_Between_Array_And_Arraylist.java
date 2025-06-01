package java_15I_collections_programs_other_important_concepts_24;

//Java program to demonstrate differences between
//Array and ArrayList
import java.util.ArrayList;
import java.util.Arrays;

//Main class
public class Java_07B_Differences_Between_Array_And_Arraylist {

	public static void main(String args[]) {

		// Normal Array
		// Need to specify the size for array
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		// We cannot add more elements to array arr[]

		// ArrayList
		// Need not to specify size

		// Declaring an Arraylist of Integer type
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Adding elements to ArrayList object
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		// We can add more elements to arrL

		// Print and display Arraylist elements
		System.out.println(al);

		// Print and display array elements
		System.out.println(Arrays.toString(arr));
	}
}
