package io.github.xeyez.designpattern.builder;

public class Main {
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~ Console");
		Builder textBuilder = new TextBuilder();
		Director textDirector = new Director(textBuilder);
		textDirector.construct();
		System.out.println(textBuilder.getResult());
		
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~ html file");
		Builder htmlBuilder = new HTMLBuilder();
		Director htmlDirector = new Director(htmlBuilder);
		htmlDirector.construct();
		System.out.println(htmlBuilder.getResult());
	}
}
