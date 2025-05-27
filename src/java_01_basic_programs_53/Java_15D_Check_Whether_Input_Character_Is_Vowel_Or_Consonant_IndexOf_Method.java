package java_01_basic_programs_53;

public class Java_15D_Check_Whether_Input_Character_Is_Vowel_Or_Consonant_IndexOf_Method {

	public static void main(String args[]) {

		char ch = 'c';

		// Make the list of vowels
		String str = "aeiouAEIOU";

		// str is a list of vowels
		if (str.indexOf(ch) == -1) {
			System.out.print(ch + " is a consonant");
		} else {
			System.out.print(ch + " is a vowel");
		}
	}
}
