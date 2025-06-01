package java_15G_collections_programs_map_interface_89;

//Java Program to Demonstrate TreeMap
//using Comparator Constructor
import java.util.Comparator;
import java.util.TreeMap;

//Class representing a Student
class Student {
	
	int rollno;
	String name, address;

	// Constructor to initialize student details
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Override the toString() method
	// to print student details
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

//Comparator class to define how to compare 
//two students based on their roll number
class SortByRoll implements Comparator<Student> {
	
	public int compare(Student a, Student b) {

		// Compare based on roll number
		return a.rollno - b.rollno;
	}
}

public class Java_04D_TreeMap_Class {

	public static void main(String[] args) {

		// Create a TreeMap using a Comparator to
		// sort Student objects by roll number
		TreeMap<Student, Integer> tm = new TreeMap<>(new SortByRoll());

		// Add students to the TreeMap with
		// their roll numbers as keys
		tm.put(new Student(111, "Geek1", "New York"), 1);
		tm.put(new Student(131, "Geek2", "London"), 2);
		tm.put(new Student(121, "Geek3", "Paris"), 3);

		// Print the TreeMap, which is automatically
		// sorted by roll number
		System.out.println("TreeMap sorted by roll number: " + tm);
	}
}
