package io.github.xeyez.designpattern.templatemethod;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay concreteDisplay1 = new ConcreteDisplay1('X');
		AbstractDisplay concreteDisplay2 = new ConcreteDisplay2("Hello");
		
		concreteDisplay1.display();
		
		System.out.println();
		
		concreteDisplay2.display();
	}
}