package com.noname.collections;

import java.util.Iterator;

import com.noname.collections.Node;

public class LinkedListIterator<T> implements Iterator<T> {
	private Node<T> listNode;

	private LinkedListIterator() {
		// private constructor
	}
	
	public LinkedListIterator(Node<T> node) {
		this.listNode = node;
	}
	
	@Override
	public boolean hasNext() {
		return (this.listNode.getNext() != null);
	}

	@Override
	public T next() {
		return this.listNode.getNext().getData();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
}
