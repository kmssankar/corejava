package org.basics.treeproblems;

class Node {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
}

public class TreeTraversals {
	static Node root;
    static Node temp = root;
	public static void main(String[] args) {

      int[] intArray = {1,3,5,7,9,10,11};
      
      

	}

	//perform Inorder traversal;
	static void inorderTraversal(Node node) {
		if(node ==null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.print( node.value);
		inorderTraversal(node.right);
	}
	
	//Insert a node in Binary Tree
	public void insertANewNode(int n,Node root) {
		if(root ==null) {
			root = new Node(n);
			return;
		}
		//when Tree is not empty
		
	}
}
