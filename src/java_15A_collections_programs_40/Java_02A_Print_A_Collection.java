package java_15A_collections_programs_40;

//Java Program to print an arraylist of an
//user-defined collection
import java.util.ArrayList;

public class Java_02A_Print_A_Collection {

	String name;
	int rollNo;

	// constructor of class GFG
	Java_02A_Print_A_Collection(String s, int n) {
		name = s;
		rollNo = n;
	}

	// over-riding the toString method
	// to print the collection
	public String toString() {
		return "Name : " + name + " | Roll No : " + rollNo;
	}

	// Driver Main Method
	public static void main(String[] args) {
		// creating an arraylist of user-defined collection
		ArrayList<Java_02A_Print_A_Collection> arr = new ArrayList<Java_02A_Print_A_Collection>();

		// creating objects of class GFG
		Java_02A_Print_A_Collection t1 = new Java_02A_Print_A_Collection("John", 101);
		Java_02A_Print_A_Collection t2 = new Java_02A_Print_A_Collection("Paul", 102);
		Java_02A_Print_A_Collection t3 = new Java_02A_Print_A_Collection("Jack", 103);
		Java_02A_Print_A_Collection t4 = new Java_02A_Print_A_Collection("Jose", 104);

		// adding objects to arraylist
		arr.add(t1);
		arr.add(t2);
		arr.add(t3);
		arr.add(t4);

		// printing the collection
		for (Java_02A_Print_A_Collection c : arr)
			System.out.println(c);
	}
}
