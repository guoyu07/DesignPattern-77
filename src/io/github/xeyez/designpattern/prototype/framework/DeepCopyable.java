package io.github.xeyez.designpattern.prototype.framework;

import java.io.Serializable;

public interface DeepCopyable<T> extends Serializable, Cloneable {
	T deepCopy();
}