package io.github.xeyez.designpattern.abstractfactory.factory;

public abstract class ComponentLink extends Item {

	protected String url;
	
	public ComponentLink(String caption, String url) {
		super(caption);
		this.url = url;
	}
}