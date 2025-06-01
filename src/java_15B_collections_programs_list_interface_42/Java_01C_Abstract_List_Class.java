package java_15B_collections_programs_list_interface_42;

import java.util.AbstractList;
import java.util.List;

public class Java_01C_Abstract_List_Class extends AbstractList<Integer> {

	private int size;

	public Java_01C_Abstract_List_Class(int size) {
		this.size = size;
	}

	@Override
	public Integer get(int index) {
		return index;
	}

	@Override
	public int size() {
		return size;
	}

	public static void main(String[] args) {

		List<Integer> list = new Java_01C_Abstract_List_Class(5);
		for (int i : list) {
			System.out.println(i);
		}
	}
}
