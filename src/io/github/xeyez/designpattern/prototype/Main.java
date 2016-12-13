package io.github.xeyez.designpattern.prototype;

import io.github.xeyez.designpattern.prototype.framework.PrototypeManager;

public class Main {
	public static void main(String[] args) {
		PrototypeManager<MyData> manager = new PrototypeManager<>();
		
		manager.register("myPrototype", new MyData());
		
		MyData p1 = manager.create("myPrototype");
		MyData p2 = manager.create("myPrototype");
		
		/* Verify "Deep copy" */
		System.out.println(p1 == p2);
		System.out.println(p1.date == p2.date);
		System.out.println(p1.subClass == p2.subClass);
		System.out.println(p1.subClass.list == p2.subClass.list);
	}
}