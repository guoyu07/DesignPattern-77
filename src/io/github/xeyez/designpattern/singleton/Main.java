package io.github.xeyez.designpattern.singleton;

public class Main {
	public static void main(String[] args) {
		DoubleCheckingLockingSingleton dclSingleton1 = DoubleCheckingLockingSingleton.getInstance();
		DoubleCheckingLockingSingleton dclSingleton2 = DoubleCheckingLockingSingleton.getInstance();
		
		System.out.println(dclSingleton1.equals(dclSingleton2));
		
		
		InitializationOnDemandHolderIdiom iodhiSingleton1 = InitializationOnDemandHolderIdiom.getInstance();
		InitializationOnDemandHolderIdiom iodhiSingleton2 = InitializationOnDemandHolderIdiom.getInstance();
		
		System.out.println(iodhiSingleton1.equals(iodhiSingleton2));
	}
}