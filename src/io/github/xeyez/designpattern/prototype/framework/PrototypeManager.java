package io.github.xeyez.designpattern.prototype.framework;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class PrototypeManager {
	private HashMap<String, DeepCopyable<?>> showcase = new HashMap<>();

	public void register(String name, DeepCopyable<?> prototype) {
		showcase.put(name, prototype);
	}

	public DeepCopyable<?> create(String name) {
		DeepCopyable<?> prototype = showcase.get(name);
		return (DeepCopyable<?>) prototype.deepCopy();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T deepCopy(T obj) {
		if (!(obj instanceof Serializable))
			throw new IllegalArgumentException("Object must implement Serializable Interface.");

		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (T) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
	}
}