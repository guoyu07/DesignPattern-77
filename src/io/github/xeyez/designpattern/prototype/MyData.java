package io.github.xeyez.designpattern.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import io.github.xeyez.designpattern.prototype.framework.DeepCopyable;
import io.github.xeyez.designpattern.prototype.framework.PrototypeManager;

public class MyData implements DeepCopyable<MyData>{

	private static final long serialVersionUID = 1L;
	
	public Date date = new Date();
	public SubClass subClass = new SubClass();

	public class SubClass implements Serializable {
		public ArrayList<Integer> list = new ArrayList<Integer>();
	}

	@Override
	public MyData deepCopy() {
		return PrototypeManager.deepCopy(this);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}