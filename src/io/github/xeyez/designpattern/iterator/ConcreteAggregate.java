package io.github.xeyez.designpattern.iterator;

public class ConcreteAggregate<T> implements Aggregate<T> {

	private T[] items;
	private int last = 0;

	public ConcreteAggregate(int capacity) {
		this.items = (T[]) new Object[capacity];
	}

	public T get(int index) {
		return items[index];
	}

	public void add(T item) {
		this.items[last] = item;
		last++;
	}

	public int length() {
		return last;
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteAggregateIterator<T>(this);
	}
}