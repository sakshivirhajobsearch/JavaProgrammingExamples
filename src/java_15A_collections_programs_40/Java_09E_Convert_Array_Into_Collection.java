package java_15A_collections_programs_40;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Java_09E_Convert_Array_Into_Collection {

	public static void main(String[] args) {

		String countryArray[] = { "India", "Pakistan", "Afganistan", "Srilanka" };

		List<String> countryList = Arrays.stream(countryArray).collect(toList());

		System.out.println("Converted ArrayList elements: " + countryList);
	}
}
