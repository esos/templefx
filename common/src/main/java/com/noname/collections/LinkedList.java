package com.noname.collections;

import java.util.Iterator;

import com.noname.interfaces.IList;
import com.noname.collections.LinkedListIterator;

public class LinkedList<T> implements IList<T>, Iterable<T> {
	private Node<T> _first, _last, _current;
	private int _count = 0;
	
	public LinkedList() {
		// initialize an empty list
	}

	@Override
	public void add(T object) {
		Node<T> newNode = new Node<T>(object);
		
		if(this.getFirst() != null && this.getCurrent() != null) {
			newNode.setPrevious(this.getCurrent());
			this.getCurrent().setNext(newNode);
			this.setCurrent(newNode);
			this.setLast(this.getCurrent());
			this.setCount(this.getCount() + 1);
		} else {
			this.setFirst(newNode);
			this.setLast(newNode);
			this.setCurrent(newNode);
			this.setCount(this.getCount() + 1);
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator<T>(this.getFirst());
	}

	public Node<T> getFirst() {
		return _first;
	}

	public void setFirst(Node<T> _first) {
		this._first = _first;
	}

	public Node<T> getLast() {
		return _last;
	}

	public void setLast(Node<T> _last) {
		this._last = _last;
	}

	public Node<T> getCurrent() {
		return _current;
	}

	public void setCurrent(Node<T> _current) {
		this._current = _current;
	}

	public int getCount() {
		return _count;
	}

	public void setCount(int _count) {
		this._count = _count;
	}
}
