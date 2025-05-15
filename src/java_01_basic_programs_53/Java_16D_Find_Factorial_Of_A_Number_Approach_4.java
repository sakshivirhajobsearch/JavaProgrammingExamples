package java_01_basic_programs_53;

//Java Program to calculate the factorial 
//of a large number using bigInteger class

import java.math.BigInteger;

public class Java_16D_Find_Factorial_Of_A_Number_Approach_4 {

	public static BigInteger factorial(int n) {

		BigInteger res = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 100;
		System.out.println("Factorial of " + num + " is " + factorial(num));
	}
}