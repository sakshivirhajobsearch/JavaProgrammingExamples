package java_15G_collections_programs_map_interface_89;

//EnumMap to store and retrive 
//values associated with enum constants
import java.util.EnumMap;

enum Days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Java_07B_EnumMap_Class {

	public static void main(String[] args) {

		EnumMap<Days, String> e = new EnumMap<>(Days.class);

		// Adding elements to the EnumMap
		e.put(Days.MONDAY, "Work");
		e.put(Days.TUESDAY, "Work");
		e.put(Days.WEDNESDAY, "Study");
		e.put(Days.THURSDAY, "Study");
		e.put(Days.FRIDAY, "Relax");

		// Getting elements from the EnumMap
		System.out.println(e.get(Days.MONDAY));
		System.out.println(e.get(Days.FRIDAY));
	}
}