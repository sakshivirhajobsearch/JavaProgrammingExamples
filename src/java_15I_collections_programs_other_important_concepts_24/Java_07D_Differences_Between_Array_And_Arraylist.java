package java_15I_collections_programs_other_important_concepts_24;

//Java Program to demonstrates how array stores primitive
//and objects and ArrayList requires wrapper classes
import java.util.ArrayList;

public class Java_07D_Differences_Between_Array_And_Arraylist {

	public static void main(String args[]) {

		// allowed
		int[] array = new int[3];

		// allowed, however, need to be initialized
		Java_07D_Differences_Between_Array_And_Arraylist[] array1 = new Java_07D_Differences_Between_Array_And_Arraylist[3];

		// not allowed (Uncommenting below line causes
		// compiler error)
		// ArrayList<char> arrL = new ArrayList<char>();

		// Allowed
		ArrayList<Integer> arrL1 = new ArrayList<>();
		ArrayList<String> arrL2 = new ArrayList<>();
		ArrayList<Object> arrL3 = new ArrayList<>();

		System.out.println("Successfully compiled and executed");
	}
}