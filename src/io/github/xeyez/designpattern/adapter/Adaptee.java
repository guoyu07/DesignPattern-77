package io.github.xeyez.designpattern.adapter;

public class Adaptee {
	private String text;
	
	public Adaptee(String text) {
		this.text = text;
	}
	
	public void showWithParen() {
		System.out.println("(" + text + ")");
	}
	
	public void showWithAster() {
		System.out.println("*" + text + "*");
	}
}