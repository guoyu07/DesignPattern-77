package io.github.xeyez.designpattern.abstractfactory.listfactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentLink;

public class ListLink extends ComponentLink {

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<li><a href=\"" + url + "\" target='_blank'>" + caption + "</a></li>\n";
	}
}