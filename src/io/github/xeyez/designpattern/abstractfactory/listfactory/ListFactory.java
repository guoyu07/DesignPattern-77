package io.github.xeyez.designpattern.abstractfactory.listfactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentLink;
import io.github.xeyez.designpattern.abstractfactory.factory.ComponentPage;
import io.github.xeyez.designpattern.abstractfactory.factory.ComponentTray;
import io.github.xeyez.designpattern.abstractfactory.factory.Factory;

public class ListFactory extends Factory {

	@Override
	public ComponentLink createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public ComponentTray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public ComponentPage createPage(String title, String author) {
		return new ListPage(title, author);
	}
}