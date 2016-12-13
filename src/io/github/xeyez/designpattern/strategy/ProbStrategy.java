package io.github.xeyez.designpattern.strategy;

import java.util.Random;

import io.github.xeyez.designpattern.strategy.Hand.HandValue;

/**
 * 직선 손에서 다음 손을 확률적으로 계산하는 전략을 표시
 * @author xeyez
 *
 */
public class ProbStrategy implements Strategy {

	private Random random;
	private HandValue prevHandValue = HandValue.ROCK;
	private HandValue currentHandValue = HandValue.ROCK;
	private int[][] history = {
			{1, 1, 1},
			{1, 1, 1},
			{1, 1, 1}
	};
	
	public ProbStrategy(long seed) {
		random = new Random(seed);
	}
	
	@Override
	public Hand nextHand() {
		int bet = random.nextInt(getSum(currentHandValue.ordinal()));
		HandValue handValue = HandValue.ROCK;
		if(bet < history[currentHandValue.ordinal()][0])
			handValue = HandValue.ROCK;
		else if (bet < history[currentHandValue.ordinal()][0] + history[currentHandValue.ordinal()][1])
			handValue = HandValue.PAPER;
		else
			handValue = HandValue.SCISSORS;
		
		prevHandValue = currentHandValue;
		currentHandValue = handValue;
		
		return Hand.getHand(handValue);
	}

	private int getSum(int ordinal) {
		
		int sum = 0;
		for(int i=0 ; i<3 ; i++) {
			sum += history[ordinal][i];
		}
		
		return sum;
	}

	@Override
	public void study(boolean win) {
		if(win) {
			history[prevHandValue.ordinal()][currentHandValue.ordinal()]++;
		}
		else {
			history[prevHandValue.ordinal()][(currentHandValue.ordinal() + 1) % 3]++;
			history[prevHandValue.ordinal()][(currentHandValue.ordinal() + 2) % 3]++;
		}
	}
}
