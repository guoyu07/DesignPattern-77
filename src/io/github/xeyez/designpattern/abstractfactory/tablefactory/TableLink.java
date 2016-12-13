package io.github.xeyez.designpattern.abstractfactory.tablefactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentLink;

public class TableLink extends ComponentLink {

	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\"" + url + "\" target='_blank'>" + caption + "</a></td>\n";
	}
}