package io.github.xeyez.designpattern.strategy;

public class Hand {
	
	public static final Hand[] hands = {
		new Hand(HandValue.ROCK), new Hand(HandValue.SCISSORS), new Hand(HandValue.PAPER)
	};
	
	public enum HandValue {
		ROCK, PAPER, SCISSORS;

		private String[] names = {"바위", "가위", "보"};
		public String korName() {
			return names[this.ordinal()];
		}
	}
	
	private HandValue handValue;
	public Hand(HandValue handValue) {
		this.handValue = handValue;
	}
	
	public static Hand getHand(HandValue handValue) {
		return hands[handValue.ordinal()];
	}
	
	public boolean isStrongerThan(Hand hand) {
		return fight(hand) == 1;
	}
	
	public boolean isWeakerThan(Hand hand) {
		return fight(hand) == -1;
	}

	private int fight(Hand hand) {
		return this == hand ? 0 : ((this.handValue.ordinal() + 1) % 3 == hand.handValue.ordinal() ? 1 : -1);
	}
	
	@Override
	public String toString() {
		return handValue.korName();
	}
}
