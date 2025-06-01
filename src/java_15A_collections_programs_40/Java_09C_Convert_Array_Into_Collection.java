package java_15A_collections_programs_40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_09C_Convert_Array_Into_Collection {

	public static void main(String[] args) {

		String countryArray[] = { "India", "Pakistan", "Afganistan", "Srilanka" };

		List<String> countryList = new ArrayList<>();
		Collections.addAll(countryList, countryArray);

		System.out.println("Converted ArrayList elements: " + countryList);
	}
}
