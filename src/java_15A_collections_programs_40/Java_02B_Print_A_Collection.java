package java_15A_collections_programs_40;

//Java program printing ArrayList
//of an user-defined collection

//Importing Classes/Files
import java.util.HashMap;
import java.util.Map;

public class Java_02B_Print_A_Collection {

	String firstName;
	String lastName;

	// Constructor
	Java_02B_Print_A_Collection(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

	// Function- toString()
	public String toString() {
		// Over-riding the toString method to print the
		// collection
		return "| First Name : " + firstName + " | LastName : " + lastName;
	}

	// Driver Main Method
	public static void main(String[] args) {
		// Creating a hashmap with key as ID and
		// value as user defined class
		HashMap<Integer, Java_02B_Print_A_Collection> hm = new HashMap<Integer, Java_02B_Print_A_Collection>();

		// creating objects
		Java_02B_Print_A_Collection p1 = new Java_02B_Print_A_Collection("Mohit", "Singh");
		Java_02B_Print_A_Collection p2 = new Java_02B_Print_A_Collection("Tarun", "Anand");
		Java_02B_Print_A_Collection p3 = new Java_02B_Print_A_Collection("Madhu", "Singh");
		Java_02B_Print_A_Collection p4 = new Java_02B_Print_A_Collection("Rohit", "Ahuja");

		// adding mappings
		hm.put(101, p1);
		hm.put(102, p2);
		hm.put(103, p3);
		hm.put(104, p4);

		// Iterating HashMap through for loop and printing the collection
		for (Map.Entry m : hm.entrySet())
			System.out.println(m.getKey() + " " + m.getValue().toString());
	}
}
