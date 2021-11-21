package com.bridgelabz;

public class Binary_Tree<K extends Comparable<K>> {
	
	private My_Binary_Node<K> root;
	
	int count=0;
	
	public void add(K key) {
		
		this.root = this.addRecursive(root, key);
	}

	private My_Binary_Node<K> addRecursive(My_Binary_Node<K> root, K key) {
		
		if(root == null) {
			return new My_Binary_Node<>(key);
		}
		int comRes = key.compareTo(root.key);
		if(comRes == 0) {
			return root;
		}
		if(comRes < 0) {
			root.left = addRecursive(root.left, key);
		}else {
			root.right = addRecursive(root.right, key);
		}
		return root;
	}
	
	public void inOrder() {
		
		inOrderRec(this.root);
	}
	private void inOrderRec(My_Binary_Node<K> root) {
		if(root != null) {

			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);

		}
	}

}
