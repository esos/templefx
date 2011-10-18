package com.noname.collections;

public abstract class AbstractGraph implements Iterable<AbstractGraphVertice> {

    LinkedList<AbstractGraphVertice> _verticeList;

    public void add(AbstractGraphVertice vertice) {
        _verticeList.add(vertice);
    }

    // insert not yet available, we can only append to the end of the list
    // as indices are not accessible
    public void insert(AbstractGraphVertice vertice) {
    }
}