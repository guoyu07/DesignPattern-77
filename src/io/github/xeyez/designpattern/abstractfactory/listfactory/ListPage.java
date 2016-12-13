package io.github.xeyez.designpattern.abstractfactory.listfactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentPage;
import io.github.xeyez.designpattern.abstractfactory.factory.Item;

public class ListPage extends ComponentPage {

	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><meta charset=\"utf-8\"><title>" + title + "</title></head></html>\n");
		
		sb.append("<body>\n");
		
		sb.append("<h1>" + title + "<h1>\n");
		
		sb.append("<ul>\n");
		for(Item content : contents) {
			sb.append(content.makeHTML());
		}
		sb.append("</ul>\n");
		
		sb.append("<hr> <address>by " + author + "</address>");
		
		sb.append("</body></html>\n");
		
		return sb.toString();
	}
}