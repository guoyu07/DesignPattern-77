package io.github.xeyez.designpattern.abstractfactory.tablefactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentTray;
import io.github.xeyez.designpattern.abstractfactory.factory.Item;

public class TableTray extends ComponentTray {

	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<td>\n");
		sb.append("<table width='100%' border='1'>");
		
		sb.append("<tr><td align='center' colspan='" + trays.size() + "'>");
		sb.append("<b>" + caption + "</b></td>");
		sb.append("</tr>");
		
		sb.append("<tr>");
		for(Item tray : trays) {
			sb.append(tray.makeHTML());
		}
		sb.append("</tr></table>\n");
		sb.append("</td>\n");
		
		return sb.toString();
	}
}