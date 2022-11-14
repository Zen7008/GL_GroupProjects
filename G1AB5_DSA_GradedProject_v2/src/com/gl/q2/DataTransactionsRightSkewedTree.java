package com.gl.q2;

public class DataTransactionsRightSkewedTree {
	
	static class Node          //node structure
	{
	    int val;
	    Node left, right;
	    Node(int item)
	    {
	        val = item;
	        left = right = null;
	    }
	}

	Node node;
	Node prevNode = null;
	Node headNode = null;

	void convertBSTtoSkewed(Node root) {
		if (root == null) {
			return;
		}

		//Inorder traversal left,root,right
		convertBSTtoSkewed(root.left);     
		
		Node rightNode = root.right;
		//connecting previous left to root/right node or right to root
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

			convertBSTtoSkewed(rightNode);
	}

	// Traverse the right skewed tree
	void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}
