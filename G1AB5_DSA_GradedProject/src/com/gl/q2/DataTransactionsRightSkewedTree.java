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

	static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void convertBSTtoSkewed(Node root) {

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

	// Traverse the right one skewed
	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	public static void main(String args[]) {
		DataTransactionsRightSkewedTree.node = new Node(50);
		DataTransactionsRightSkewedTree.node.left = new Node(30);
		DataTransactionsRightSkewedTree.node.right = new Node(60);
		DataTransactionsRightSkewedTree.node.left.left = new Node(10);
		DataTransactionsRightSkewedTree.node.right.left = new Node(55);

		convertBSTtoSkewed(node);
		traverseRightSkewed(headNode);
	}
}
