package io.github.xeyez.designpattern.iterator;

public interface Iterator<T> {
	boolean hasNext();
	T next();
}