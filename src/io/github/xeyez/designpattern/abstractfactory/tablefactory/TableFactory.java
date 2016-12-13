package io.github.xeyez.designpattern.abstractfactory.tablefactory;

import io.github.xeyez.designpattern.abstractfactory.factory.ComponentLink;
import io.github.xeyez.designpattern.abstractfactory.factory.ComponentPage;
import io.github.xeyez.designpattern.abstractfactory.factory.ComponentTray;
import io.github.xeyez.designpattern.abstractfactory.factory.Factory;

public class TableFactory extends Factory {

	@Override
	public ComponentLink createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public ComponentTray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public ComponentPage createPage(String title, String author) {
		return new TablePage(title, author);
	}
}
