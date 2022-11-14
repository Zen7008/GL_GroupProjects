package com.gl.q2;

import com.gl.q2.DataTransactionsRightSkewedTree.Node;

class Main{
	
	
	public static void main(String args[]) {
		
		DataTransactionsRightSkewedTree test=new DataTransactionsRightSkewedTree();
		
		test.node = new Node(50);
		test.node.left = new Node(30);
		test.node.right = new Node(60);
		test.node.left.left = new Node(10);
		test.node.right.left = new Node(55);
	
		test.convertBSTtoSkewed(test.node);
		test.traverseRightSkewed(test.headNode);
	}
	
	
}