package io.github.xeyez.designpattern.singleton;

public class DoubleCheckingLockingSingleton {
	private static volatile DoubleCheckingLockingSingleton instance;
	
	public static DoubleCheckingLockingSingleton getInstance() {
		
		if(instance == null) {
			synchronized (DoubleCheckingLockingSingleton.class) {
				if(instance == null)
					instance = new DoubleCheckingLockingSingleton();
			}
		}
		
		return instance;
	}
}