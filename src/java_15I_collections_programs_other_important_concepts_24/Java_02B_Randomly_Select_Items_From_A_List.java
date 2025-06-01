package java_15I_collections_programs_other_important_concepts_24;

//Java Program to demonstrate the working 
//of ThreadLocalRandom class

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Java_02B_Randomly_Select_Items_From_A_List {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		Java_02B_Randomly_Select_Items_From_A_List o = new Java_02B_Randomly_Select_Items_From_A_List();
		System.out.println("Random Element: " + o.getRandomElement(l));
	}

	public int getRandomElement(List<Integer> l) {
		return l.get(ThreadLocalRandom.current().nextInt(l.size()));
	}
}