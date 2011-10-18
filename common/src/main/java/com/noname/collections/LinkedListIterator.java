package com.noname.collections;

import java.util.Iterator;

import com.noname.collections.Node;

public class LinkedListIterator<T> implements Iterator<T> {
	private Node<T> _node;

	private LinkedListIterator() {
		// private constructor
	}
	
	public LinkedListIterator(Node<T> node) {
		this.setCurrentNode(node);
	}
	
	@Override
	public boolean hasNext() {
		return (this.getCurrentNode() != null);
	}

	@Override
	public T next() {
		Node<T> currentNode = this.getCurrentNode();
		this.setCurrentNode(currentNode.getNext());
		return currentNode.getData();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}

	public Node<T> getCurrentNode() {
		return _node;
	}

	public void setCurrentNode(Node<T> node) {
		this._node = node;
	}
}
