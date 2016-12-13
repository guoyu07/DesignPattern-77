package io.github.xeyez.designpattern.bridge;

public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));

		d1.display();
		d2.display();
		((CountDisplay) d2).multiDisplay(5);
	}
}