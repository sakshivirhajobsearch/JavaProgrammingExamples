package java_01_basic_programs_53;

public class Java_15B_Check_Whether_Input_Character_Is_Vowel_Or_Consonant_Capital_Letters {

	public static void main(String args[]) {
		char ch = 'B';

		// check using if else
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel");
		} else {
			System.out.println(ch + " is a consonant");
		}
	}
}