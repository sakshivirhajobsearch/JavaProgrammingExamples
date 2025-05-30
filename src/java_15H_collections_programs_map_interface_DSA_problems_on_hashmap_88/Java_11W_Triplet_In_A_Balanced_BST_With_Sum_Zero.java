package java_15H_collections_programs_map_interface_DSA_problems_on_hashmap_88;

//Java program to find triplets in a 
//BST that sum to 0.

class Node {

	int key;
	Node left, right;

	Node(int x) {
		key = x;
		left = right = null;
	}
}

public class Java_11W_Triplet_In_A_Balanced_BST_With_Sum_Zero {

	// A function to convert given BST to a Doubly
	// Linked List (DLL).
	static void convertBSTtoDLL(Node root, Node[] head, Node[] tail) {
		if (root == null) {
			return;
		}

		// Recursively convert the left subtree
		if (root.left != null)
			convertBSTtoDLL(root.left, head, tail);

		root.left = tail[0];

		// If tail is not null, then set the right of tail as root,
		// else the current node is the head of the DLL.
		if (tail[0] != null)
			tail[0].right = root;
		else
			head[0] = root;

		tail[0] = root;

		// Recursively convert the right subtree
		if (root.right != null)
			convertBSTtoDLL(root.right, head, tail);
	}

	// This function returns true if there is a pair
	// in the DLL with a sum equal to the given sum.
	static boolean isPresentInDLL(Node head, Node tail, int sum) {

		while (head != tail) {
			int currSum = head.key + tail.key;
			if (currSum == sum)
				return true;
			else if (currSum > sum)
				tail = tail.left;
			else
				head = head.right;
		}
		return false;
	}

	// The main function that returns true if there
	// is a 0-sum triplet in the BST, otherwise false.
	static boolean isTripletPresent(Node root) {

		// Check if the BST is empty
		if (root == null)
			return false;

		// Convert the given BST to a Doubly
		// Linked List
		Node head = null;
		Node tail = null;
		Node[] headRef = new Node[1];
		Node[] tailRef = new Node[1];
		convertBSTtoDLL(root, headRef, tailRef);
		head = headRef[0];
		tail = tailRef[0];

		// Now, iterate through every node and find if
		// there is a pair with a sum equal to -1 * head->key
		Node curr = head;
		while (curr != null && curr.right != null) {

			// If a pair with sum equal to -1 * curr->key is found,
			// return true
			if (isPresentInDLL(curr.right, tail, -1 * curr.key))
				return true;

			curr = curr.right;
		}

		return false;
	}

	public static void main(String[] args) {

		// Construct the BST
		// 6
		// / \
		// -13 14
		// \ / \
		// -8 13 15
		// /
		// 7
		Node root = new Node(6);
		root.left = new Node(-13);
		root.right = new Node(14);
		root.left.right = new Node(-8);
		root.right.left = new Node(13);
		root.right.right = new Node(15);
		root.right.left.left = new Node(7);

		if (isTripletPresent(root))
			System.out.println("true");
		else
			System.out.println("false");
	}
}