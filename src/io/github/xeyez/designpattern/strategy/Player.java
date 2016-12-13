package io.github.xeyez.designpattern.strategy;

public class Player {
	Strategy strategy;
	
	private String name;
	private int winCount;
	private int loseCount;
	private int gameCount;
	
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	
	public Hand nextHand() {
		return strategy.nextHand();
	}
	
	public void win() {
		strategy.study(true);
		winCount++;
		gameCount++;
	}
	
	public void lose() {
		strategy.study(false);
		loseCount++;
		gameCount++;
	}
	
	public void draw() {
		gameCount++;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", winCount=" + winCount + ", loseCount=" + loseCount + ", gameCount="
				+ gameCount + "]";
	}
}