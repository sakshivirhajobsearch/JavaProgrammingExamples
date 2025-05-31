package java_15G_collections_programs_map_interface_89;

//Java Program to demonstrate 
//the working of EnumMap 
import java.util.EnumMap;

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Java_07A_EnumMap_Class {

	public static void main(String[] args) {

		// Create an EnumMap for Day enum
		EnumMap<Day, String> dayMap = new EnumMap<>(Day.class);

		// Add elements to the EnumMap
		dayMap.put(Day.MONDAY, "Start of the week");
		dayMap.put(Day.FRIDAY, "End of the week");
		dayMap.put(Day.SUNDAY, "Weekend");

		// Print all elements in the EnumMap
		for (Day day : dayMap.keySet()) {
			System.out.println(day + ": " + dayMap.get(day));
		}
	}
}