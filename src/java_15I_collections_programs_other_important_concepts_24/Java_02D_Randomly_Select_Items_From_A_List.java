package java_15I_collections_programs_other_important_concepts_24;

//Select random elements from a 
//list without repetition

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Java_02D_Randomly_Select_Items_From_A_List {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		Java_02D_Randomly_Select_Items_From_A_List o = new Java_02D_Randomly_Select_Items_From_A_List();
		System.out.println("Random Elements: " + o.getRandomElements(l, 3));
	}

	public List<Integer> getRandomElements(List<Integer> l, int totalItems) {
		Random r = new Random();
		List<Integer> newList = new ArrayList<>();

		for (int i = 0; i < totalItems; i++) {
			int randomIndex = r.nextInt(l.size());
			newList.add(l.get(randomIndex));
			l.remove(randomIndex); // Remove selected item
		}

		return newList;
	}
}