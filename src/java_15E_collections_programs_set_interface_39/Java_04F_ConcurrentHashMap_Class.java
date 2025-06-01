package java_15E_collections_programs_set_interface_39;

//Java Program for traversing a
//ConcurrentHashMap
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Java_04F_ConcurrentHashMap_Class {

	public static void main(String[] args) {

		// create an instance of ConcurrentHashMap
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();

		// Add elements using put()
		m.put(8, "Third");
		m.put(6, "Second");
		m.put(3, "First");
		m.put(11, "Fourth");

		// Create an Iterator over the
		// ConcurrentHashMap
		Iterator<ConcurrentHashMap.Entry<Integer, String>> i = m.entrySet().iterator();

		// The hasNext() method is used to check if there is
		// a next element The next() method is used to
		// retrieve the next element
		while (i.hasNext()) {
			ConcurrentHashMap.Entry<Integer, String> entry = i.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}