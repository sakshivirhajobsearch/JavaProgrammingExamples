package java_01_basic_programs_53;

public class Java_04D_Swap_Two_Numbers_Arithmetic_Operators {

	public static void main(String[] args) {

		int a = 10, b = 22;
		System.out.println("Before swapping Value of a is " + a + " and Value of b is " + b);
		a = (a + b) - (b = a);
		System.out.println("After Swapping Value of a is " + a + " and Value of b is " + b);

	}
}
