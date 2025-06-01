package java_15A_collections_programs_40;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Java program to convert Collections into Array

//Importing generic Java libraries
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_08B_Convert_Collection_Into_Array {

	// Main driver code
	public static void main(String[] args) {

		// Reading input from the user
		// via BufferedReader class
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// 'in' is object created of this class

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Creating ArrayList to store user input
		List<String> list = new ArrayList<String>();

		// Taking input from user
		// adding elements to the list
		while (sc.hasNext()) {
			String i = sc.nextLine();
			list.add(i);
		}

		// Converting list to an array
		String[] str = list.toArray(new String[0]);

		// Iteration over array
		for (int i = 0; i < str.length; i++) {
			String data = str[i];

			// Printing the elements
			System.out.print(data);
		}
	}
}