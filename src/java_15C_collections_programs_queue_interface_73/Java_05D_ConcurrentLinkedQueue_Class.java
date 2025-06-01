package java_15C_collections_programs_queue_interface_73;

//Java Program to demonstrate adding
//elements to ConcurrentLinkedQueue 
//using add() and addAll() method
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Java_05D_ConcurrentLinkedQueue_Class {

	public static void main(String[] args) {
		
		// Create an instance of ConcurrentLinkedQueue
		ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();

		// Add String to queue using add method
		q.add("Java");
		q.add("C++");
		q.add("Python");
		q.add("Js");

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + q);

		// create a ArrayList of Strings
		ArrayList<String> al = new ArrayList<String>();

		// add String to ArrayList
		al.add("Geek1");
		al.add("Geek2");
		al.add("Geek3");
		al.add("Geek4");
		al.add("Geek5");

		// Displaying the existing Collection
		System.out.println("Collection to be added: " + al);

		// apply addAll() method and passed
		// the arraylist as parameter
		boolean b = q.addAll(al);

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("Collection added: " + b);

		// Displaying the existing ConcurrentLinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + q);
	}
}
