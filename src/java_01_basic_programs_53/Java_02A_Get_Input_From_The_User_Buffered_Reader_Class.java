package java_01_basic_programs_53;

// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_02A_Get_Input_From_The_User_Buffered_Reader_Class {

	public static void main(String[] args) throws IOException {

		// Enter data using BufferReader
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String s = r.readLine();

		// Printing the read line
		System.out.println(s);
	}
}