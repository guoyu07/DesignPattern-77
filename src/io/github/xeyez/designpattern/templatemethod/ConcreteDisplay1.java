package io.github.xeyez.designpattern.templatemethod;

public class ConcreteDisplay1 extends AbstractDisplay {

	private char ch;
	
	public ConcreteDisplay1(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.print(">>");
	}
}
