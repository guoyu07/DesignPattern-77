package io.github.xeyez.designpattern.factorymethod;

import io.github.xeyez.designpattern.factorymethod.framework.AbstractFactory;
import io.github.xeyez.designpattern.factorymethod.framework.AbstractProduct;
import io.github.xeyez.designpattern.factorymethod.idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		AbstractFactory factory = new IDCardFactory();
		
		AbstractProduct card1 = factory.create("Jake");
		AbstractProduct card2 = factory.create("Smith");
		
		card1.use();
		card2.use();
		
		System.out.println();
		for(String owner : ((IDCardFactory) factory).getOwners()) {
			System.out.println("등록된 사용자 : " + owner);
		}
	}
}