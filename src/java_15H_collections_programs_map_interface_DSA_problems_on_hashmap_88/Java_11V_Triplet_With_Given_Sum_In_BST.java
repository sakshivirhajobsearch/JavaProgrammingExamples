package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to check if a triplet with
//given target exists in the BST or not
import java.util.ArrayList;

class Node {

	int data;
	Node left, right;

	Node(int x) {
		data = x;
		left = right = null;
	}
}

public class Java_11V_Triplet_With_Given_Sum_In_BST {

	// A utility function to do inorder traversal
	// of the BST and store values in a vector
	static void inorder(Node curr, ArrayList<Integer> arr) {

		if (curr != null) {
			inorder(curr.left, arr);
			arr.add(curr.data);
			inorder(curr.right, arr);
		}
	}

	// Function to check if a triplet with given SUM
	// exists in the BST or not
	static boolean checkForTriplet(Node root, int sum) {

		// Vector to store the inorder traversal
		// of the BST
		ArrayList<Integer> arr = new ArrayList<>();

		// Call inorder() to do the inorder
		// on the BST and store it in arr
		inorder(root, arr);

		// Now, check if any triplet with given sum
		// exists in the BST or not
		int l, r;

		// Now fix the first element one by one and find the
		// other two elements
		for (int i = 0; i < arr.size() - 2; i++) {

			// To find the other two elements, start two index
			// variables from two corners of the array and move
			// them toward each other
			l = i + 1;

			// index of the last element
			r = arr.size() - 1;
			while (l < r) {

				// If we find pair with target - arr[i]
				// then return true
				if (arr.get(l) + arr.get(r) == sum - arr.get(i)) {
					return true;
				} else if (arr.get(l) + arr.get(r) < sum - arr.get(i))
					l++;
				else
					r--;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		// creating the following BST
		// 50
		// / \
		// 30 70
		// / \ / \
		// 20 40 60 80
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(70);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right.left = new Node(60);
		root.right.right = new Node(80);

		int sum = 120;

		if (checkForTriplet(root, sum))
			System.out.println("true");
		else
			System.out.println("false");
	}
}