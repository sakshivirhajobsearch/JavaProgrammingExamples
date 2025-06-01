package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

public class Java_08A_Max_Distance_Between_Two_Occurrences_In_Array {

	// function to find the maximum distance
	static int maxDistance(int[] arr) {

		int res = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				// check if two elements are equal
				if (arr[i] == arr[j]) {

					// calculate the distance and update res
					res = Math.max(res, j - i);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 1, 3, 4, 2, 5, 6, 5 };
		System.out.println(maxDistance(arr));
	}
}