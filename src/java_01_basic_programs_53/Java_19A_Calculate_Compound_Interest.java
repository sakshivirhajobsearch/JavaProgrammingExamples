package java_01_basic_programs_53;

public class Java_19A_Calculate_Compound_Interest {

	public static void main(String args[]) {

		double principal = 10000, rate = 10.25, time = 5;

		/* Calculate compound interest */
		double CI = principal * (Math.pow((1 + rate / 100), time));

		System.out.println("Compound Interest is " + CI);
	}
}
