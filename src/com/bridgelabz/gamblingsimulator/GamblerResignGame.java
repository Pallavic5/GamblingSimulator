package com.bridgelabz.gamblingsimulator;
/*problem statement
 * UC -3 As a Calculative Gambler if won or lost 50% of the stake, would resign for the day
 */
public class GamblerResignGame {

	public static void startGambling() {
		int stakePerDay = 100;
		int betPerGame = 1;
			//condition to check gambler won or lost by 50%
		while (stakePerDay != 150 || stakePerDay != 50) {
			int result = (int) Math.floor(Math.random() * 2);
			System.out.println("Value is " + result);
			if (result == 0) {
				System.out.println("Gambler loose the game.");
				stakePerDay--; // Decrement the stake value
			} else {
				System.out.println("Gambler won the game.");
				stakePerDay++; // Increment the stake value
			}
			if (stakePerDay == 150) {
				System.out.println("Gambler win 50% of the stake.");
				break;
			} else if (stakePerDay == 50) {
				System.out.println("Gambler lost 50% of the stake.");
				break;
			}
		}
	}
		//main method
	public static void main(String[] args) {
		//method calling
		startGambling();
	}

}
