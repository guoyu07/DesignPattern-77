package io.github.xeyez.designpattern.abstractfactory.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public abstract class ComponentPage {
	protected String title;
	protected String author;
	protected ArrayList<Item> contents = new ArrayList<>();
	
	public ComponentPage(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void add(Item item) {
		contents.add(item);
	}
	
	public void output() {
		String fileName = title + ".html";
		
		try (Writer writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(this.makeHTML());
			System.out.println(fileName + " 작성.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract String makeHTML();
}