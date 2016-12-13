package io.github.xeyez.designpattern.abstractfactory.factory;

import java.util.ArrayList;

public abstract class ComponentTray extends Item {
	
	protected ArrayList<Item> trays = new ArrayList<>();
	
	public ComponentTray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		trays.add(item);
	}
}