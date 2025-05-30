package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java implementation to find if there exists a triplet in the array
import java.util.Arrays;
import java.util.List;

public class Java_11Q3_Triplets_With_Sum_of_2_Equal_To_3rd {

	public static boolean findTriplet(List<Integer> arr) {

		int n = arr.size();

		// Sort the array
		Integer[] array = arr.toArray(new Integer[0]);
		Arrays.sort(array);

		// Iterate through the array
		for (int i = 2; i < n; i++) {
			int left = 0, right = i - 1;

			while (left < right) {
				int sum = array[left] + array[right];

				if (sum == array[i])
					return true;
				else if (sum < array[i])
					left++;
				else
					right--;
			}
		}

		return false;
	}

	// Driver Code with Predefined Input
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);

		if (findTriplet(arr))
			System.out.println("true");
		else
			System.out.println("false");
	}
}