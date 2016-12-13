package io.github.xeyez.designpattern.abstractfactory.factory;

public abstract class Factory {
	
	public static Factory getFactory(String className) {
		Factory factory = null;
		
		try {
			factory = (Factory) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return factory;
	}
	
	public abstract ComponentLink createLink(String caption, String url);
	public abstract ComponentTray createTray(String caption);
	public abstract ComponentPage createPage(String title, String author);
}