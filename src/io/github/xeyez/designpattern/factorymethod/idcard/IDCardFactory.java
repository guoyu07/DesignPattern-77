package io.github.xeyez.designpattern.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import io.github.xeyez.designpattern.factorymethod.framework.AbstractFactory;
import io.github.xeyez.designpattern.factorymethod.framework.AbstractProduct;

public class IDCardFactory extends AbstractFactory {

	private List<String> owners = new ArrayList<>();
	
	@Override
	protected AbstractProduct createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(AbstractProduct product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List<String> getOwners() {
		return owners;
	}
}
