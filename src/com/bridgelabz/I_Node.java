package com.bridgelabz;

public interface I_Node<K> {
	K getKey();
	void setkey(K key);
	I_Node<K> getNext();
	void setNext(I_Node<K> next);

}
