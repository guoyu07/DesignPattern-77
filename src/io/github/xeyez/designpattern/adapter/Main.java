package io.github.xeyez.designpattern.adapter;

public class Main {
	public static void main(String[] args) {
		Target p = new Adapter("Hello");
		p.printWeak();
		p.printStrong();
	}
}