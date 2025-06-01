package java_15A_collections_programs_40;

//Convert an Array into Collection in Java

//import java util library
import java.util.Arrays;
import java.util.List;

public class Java_09B_Convert_Array_Into_Collection {

	public static void main(String args[]) {

		String countryArray[] = { "India", "Pakistan", "Afganistan", "Srilanka" };

		System.out.println("Array input: " + Arrays.toString(countryArray));

		List countryList = Arrays.asList(countryArray);
		System.out.println("Converted elements: " + countryList);
	}
}
