package java_15G_collections_programs_map_interface_89;

import java.util.Iterator;
//Java Program to demonstrates 
//how to iterate over ConcurrentMap
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Java_03F_ConcurrentMap_Interface {

	public static void main(String[] args) {

		// Instantiate an object
		// Since ConcurrentMap
		// is an interface so We use
		// ConcurrentSkipListMap
		ConcurrentMap<Integer, String> map = new ConcurrentSkipListMap<Integer, String>();

		// Add elements using put()
		map.put(8, "Third");
		map.put(6, "Second");
		map.put(3, "First");
		map.put(11, "Fourth");

		// Create an Iterator over the
		// ConcurrentSkipListMap
		Iterator<ConcurrentSkipListMap.Entry<Integer, String>> itr = map.entrySet().iterator();

		// The hasNext() method is used to check if there is
		// a next element The next() method is used to
		// retrieve the next element
		while (itr.hasNext()) {
			ConcurrentSkipListMap.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}