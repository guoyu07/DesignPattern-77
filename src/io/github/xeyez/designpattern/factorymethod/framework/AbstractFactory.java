package io.github.xeyez.designpattern.factorymethod.framework;

public abstract class AbstractFactory {
	public final AbstractProduct create(String owner) {
		AbstractProduct product = createProduct(owner);
		registerProduct(product);
		return product;
	}

	protected abstract AbstractProduct createProduct(String owner);
	protected abstract void registerProduct(AbstractProduct product);
}
