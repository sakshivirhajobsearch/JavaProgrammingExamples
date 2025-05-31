package java_15G_collections_programs_map_interface_89;

import java.util.IdentityHashMap;

//Java code to demonstrate IdentityHashMap 

import java.util.Map;

public class Java_09B_IdentityHashMap_Class {

	public static void main(String[] args) {

		// creating an instance of IdentityHashMap
		Map<String, String> ihm = new IdentityHashMap<>();

		// Putting key and value pair
		// in a IdentityHashMap Object
		ihm.put("ihmkey", "ihmvalue");
		ihm.put(new String("ihmkey"), "ihmvalue1");

		// ihm.size() will print 2 since it
		// compares the objects by reference
		System.out.println("Size of IdentityHashMap--" + ihm.size());

	}
}
