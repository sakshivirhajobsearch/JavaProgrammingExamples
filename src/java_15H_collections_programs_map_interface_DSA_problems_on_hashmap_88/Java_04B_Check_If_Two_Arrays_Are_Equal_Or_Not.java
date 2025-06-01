package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

import java.util.HashMap;
import java.util.Map;

public class Java_04B_Check_If_Two_Arrays_Are_Equal_Or_Not {

	public static boolean checkEqual(int a[], int b[]) {

		int n = a.length, m = b.length;
		if (n != m)
			return false;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (map.get(a[i]) == null)
				map.put(a[i], 1);
			else {
				count = map.get(a[i]);
				count++;
				map.put(a[i], count);
			}
		}

		for (int i = 0; i < n; i++) {

			if (!map.containsKey(b[i]))
				return false;

			if (map.get(b[i]) == 0)
				return false;

			count = map.get(b[i]);
			--count;
			map.put(b[i], count);
		}

		return true;
	}

	public static void main(String[] args) {
		
		int a[] = { 3, 5, 2, 5, 2 };
		int b[] = { 2, 3, 5, 5, 2 };

		if (checkEqual(a, b))
			System.out.println("true");
		else
			System.out.println("false");
	}
}