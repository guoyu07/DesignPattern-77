package io.github.xeyez.designpattern.adapter;

public class Adapter implements Target {

	private Adaptee banner;
	
	public Adapter(String text) {
		banner = new Adaptee(text);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}