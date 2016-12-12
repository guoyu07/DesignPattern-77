package io.github.xeyez.designpattern.iterator;

public class Main {
	public static void main(String[] args) {
		ConcreteAggregate<Item> bookShelf = new ConcreteAggregate<>(4);
		bookShelf.add(new Item("Book1"));
		bookShelf.add(new Item("Book2"));
		
		Iterator<Item> it = bookShelf.iterator();
		while(it.hasNext()) {
			Item item = it.next();
			System.out.println(item.getStr());
		}
	}
}