package io.github.xeyez.designpattern.strategy;

import java.util.Random;

import io.github.xeyez.designpattern.strategy.Hand.HandValue;

/**
 * 이기면 다음에도 같은 손을 내는 전략을 표시
 * @author xeyez
 *
 */
public class WinningStrategy implements Strategy {

	public Random random;
	private boolean won = false;
	private Hand prevHand;
	
	public WinningStrategy(long seed) {
		random = new Random(seed);
	}
	
	@Override
	public Hand nextHand() {
		if(!won)
			prevHand = Hand.getHand(HandValue.values()[random.nextInt(3)]);
		
		return prevHand;
	}

	@Override
	public void study(boolean win) {
		won = win;
	}
}