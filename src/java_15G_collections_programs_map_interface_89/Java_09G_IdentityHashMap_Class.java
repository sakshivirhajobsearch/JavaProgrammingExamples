package java_15G_collections_programs_map_interface_89;

import java.util.HashMap;
import java.util.IdentityHashMap;

//Java code to demonstrate IdentityHashMap and
//illustration of how it is different from HashMap 

import java.util.Map;

public class Java_09G_IdentityHashMap_Class {

	public static void main(String[] args) {

		// Creating HashMap and IdentityHashMap objects
		Map<String, String> hm = new HashMap<>();
		Map<String, String> ihm = new IdentityHashMap<>();

		// Putting key and value in HashMap and IdentityHashMap Object
		hm.put("hmkey", "hmvalue");
		hm.put(new String("hmkey"), "hmvalue1");
		ihm.put("ihmkey", "ihmvalue");
		ihm.put(new String("ihmkey"), "ihmvalue1");

		// Print Size of HashMap and WeakHashMap Object
		// hm.size() will print 1 since it compares the objects logically
		// and both the keys are same
		System.out.println("Size of HashMap is : " + hm.size());

		// ihm.size() will print 2 since it compares the objects by reference
		System.out.println("Size of IdentityHashMap is : " + ihm.size());

	}
}