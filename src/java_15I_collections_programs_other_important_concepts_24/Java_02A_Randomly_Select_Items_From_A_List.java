package java_15I_collections_programs_other_important_concepts_24;

// Randomly select an element from a list
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Java_02A_Randomly_Select_Items_From_A_List {

	public static void main(String[] args) {

		// creating a list of integer type
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		Java_02A_Randomly_Select_Items_From_A_List o = new Java_02A_Randomly_Select_Items_From_A_List();

		// take a random element from list and print them
		System.out.println("Random Element: " + o.getRandomElement(l));
	}

	// Function select an element base on index
	// and return an element
	public int getRandomElement(List<Integer> l) {
		Random r = new Random();
		return l.get(r.nextInt(l.size()));
	}
}