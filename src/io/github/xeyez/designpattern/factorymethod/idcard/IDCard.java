package io.github.xeyez.designpattern.factorymethod.idcard;

import io.github.xeyez.designpattern.factorymethod.framework.AbstractProduct;

public class IDCard extends AbstractProduct {

	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner + " 카드 생성");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + " 카드 사용");
	}
	
	public String getOwner() {
		return owner;
	}
}