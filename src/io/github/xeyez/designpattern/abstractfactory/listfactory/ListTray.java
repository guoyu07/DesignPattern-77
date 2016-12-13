package io.github.xeyez.designpattern.abstractfactory.listfactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentTray;
import io.github.xeyez.designpattern.abstractfactory.factory.Item;

public class ListTray extends ComponentTray {

	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append(caption);
		
		sb.append("\n<ul>\n");
		
		for(Item tray : trays) {
			sb.append(tray.makeHTML());
		}
		
		sb.append("</ul>\n");
		sb.append("</li>\n");
		
		return sb.toString();
	}
}