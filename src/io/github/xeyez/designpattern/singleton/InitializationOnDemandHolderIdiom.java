package io.github.xeyez.designpattern.singleton;

public class InitializationOnDemandHolderIdiom {
	
	private static class SingletonHolder {
		public static final InitializationOnDemandHolderIdiom INSTANCE = new InitializationOnDemandHolderIdiom();
	}
	
	public static InitializationOnDemandHolderIdiom getInstance() {
		return SingletonHolder.INSTANCE;
	}
}