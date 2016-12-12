package io.github.xeyez.designpattern.iterator;

public class Main {
	public static void main(String[] args) {
		ConcreteAggregate<Book> bookShelf = new ConcreteAggregate<>(4);
		bookShelf.add(new Book("Book1"));
		bookShelf.add(new Book("Book2"));
		
		Iterator<Book> it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}