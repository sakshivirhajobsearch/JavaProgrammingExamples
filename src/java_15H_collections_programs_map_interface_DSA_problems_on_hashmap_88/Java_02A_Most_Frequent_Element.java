package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find the most frequent element in an array.

public class Java_02A_Most_Frequent_Element {

	static int mostFreqEle(int[] arr) {
		int n = arr.length, maxcount = 0;
		int res = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			// If count is greater or if count
			// is same but value is bigger.
			if (count > maxcount || (count == maxcount && arr[i] > res)) {
				maxcount = count;
				res = arr[i];
			}
		}

		return res;
	}

	public static void main(String[] args) {
		
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
		System.out.println(mostFreqEle(arr));
	}
}