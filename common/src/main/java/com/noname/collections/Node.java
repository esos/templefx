package com.noname.collections;

public class Node<T> {
	private T _data;
	private Node<T> _next;
	private Node<T> _previous;
	
	public Node() {
	}
	
	public Node(T object) {
		this.setData(object);
	}
	
	public Node(T object, Node<T> next) {
		this.setData(object);
		this.setNext(next);
	}
	
	public Node(T object, Node<T> next, Node<T> previous) {
		this.setData(object);
		this.setNext(next);
		this.setPrevious(previous);
	}

	public T getData() {
		return _data;
	}

	public void setData(T _data) {
		this._data = _data;
	}

	public Node<T> getNext() {
		return _next;
	}

	public void setNext(Node<T> _next) {
		this._next = _next;
	}

	public Node<T> getPrevious() {
		return _previous;
	}

	public void setPrevious(Node<T> _previous) {
		this._previous = _previous;
	}
}
