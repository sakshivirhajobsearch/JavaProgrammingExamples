package java_01_basic_programs_53;

public class Java_15A_Check_Whether_Input_Character_Is_Vowel_Or_Consonant_If_Else_Statement {

	public static void main(String args[]) {
		char ch = 'b';

		// check using if else
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel");
		} else {
			System.out.println(ch + " is a consonant");
		}
	}
}