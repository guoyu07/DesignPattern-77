package io.github.xeyez.designpattern.builder;

public interface Builder {
	void makeTitle(String title);
	void makeString(String str);
	void makeItems(String[] items);
	void close();
	String getResult();
}