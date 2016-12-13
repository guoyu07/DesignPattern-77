package io.github.xeyez.designpattern.strategy;

public class Main {
	public static void main(String[] args) {
		Player player1 = new Player("Jake", new WinningStrategy(314));
		Player player2 = new Player("Smith", new ProbStrategy(15));
		
		for(int i=0 ; i<1000 ; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			
			if(nextHand1.isStrongerThan(nextHand2)) {
				System.out.println("Winner : " + player1);
				player1.win();
				player2.lose();
			}
			else if(nextHand2.isStrongerThan(nextHand1)) {
				System.out.println("Winner : " + player2);
				player2.win();
				player1.lose();
			}
			else {
				System.out.println("Draw");
				player1.draw();
				player2.draw();
			}
		}
		
		System.out.println("\nTotal result");
		System.out.println(player1);
		System.out.println(player2);
	}
}