package io.github.xeyez.designpattern.abstractfactory.tablefactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentPage;
import io.github.xeyez.designpattern.abstractfactory.factory.Item;

public class TablePage extends ComponentPage {

	public TablePage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><meta charset=\"utf-8\"><title>" + title + "</title></head></html>\n");
		
		sb.append("<body>\n");
		
		sb.append("<h1>" + title + "<h1>\n");
		
		sb.append("<table border='3'>\n");
		for(Item content : contents) {
			sb.append(content.makeHTML());
		}
		sb.append("</table>\n");
		
		sb.append("<hr> <address>by " + author + "</address>");
		
		sb.append("</body></html>\n");
		
		return sb.toString();
	}
}