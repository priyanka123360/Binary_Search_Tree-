package com.bridgelabz;

public class My_Binary_Node <K extends Comparable<K>> {
	
	K key;
	My_Binary_Node<K> left;
	My_Binary_Node<K> right;
	
	public My_Binary_Node(K key) {
		this.key = key;
	}

}
