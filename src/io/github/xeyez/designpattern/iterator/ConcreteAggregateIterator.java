package io.github.xeyez.designpattern.iterator;

public class ConcreteAggregateIterator<T> implements Iterator<T> {
	
	private ConcreteAggregate<T> concreteAggregate;
	private int index = 0;

	public ConcreteAggregateIterator(ConcreteAggregate<T> concreteAggregate) {
		this.concreteAggregate = concreteAggregate;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < concreteAggregate.length();
	}

	@Override
	public T next() {
		T item = concreteAggregate.get(index);
		index++;
		return item;
	}
}