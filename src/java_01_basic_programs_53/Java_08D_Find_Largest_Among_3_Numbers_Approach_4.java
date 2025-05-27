package java_01_basic_programs_53;

public class Java_08D_Find_Largest_Among_3_Numbers_Approach_4 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20, num3 = 15;
		int largest = Math.max(Math.max(num1, num2), num3);

		System.out.println("The largest number is: " + largest);
	}
}
