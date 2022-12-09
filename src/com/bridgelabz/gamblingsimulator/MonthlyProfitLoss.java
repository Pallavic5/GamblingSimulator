package com.bridgelabz.gamblingsimulator;
/*Problem Statement
 * UC - 5 Each month would like to know the days won and lost and by how much.
 */
public class MonthlyProfitLoss {
	public static int startGambling() {
		int stakePerDay = 100;
		int betPerGame = 1;
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
		return stakePerDay;
	}
	public static void calculateTotalAmount() {
		int totalAmountInvestIn20Days = 2000;
		int amountafter20Days = 0;
		// iterate upto 20 days
		for (int i = 1; i <= 20; i++) {
			int result = startGambling();
			amountafter20Days += result;
			if (result == 50) {
				System.out.println("Lost 50$ in day " + i);
			}
			if (result == 150) {
				System.out.println("Win 50$ in day " + i);
			}
		}
		System.out.println("After 20 days amount: " + amountafter20Days);
		if (amountafter20Days > totalAmountInvestIn20Days) {
			int profit = amountafter20Days - totalAmountInvestIn20Days;
			System.out.println("Total profit after 20 days is = " + profit);

		} else if (amountafter20Days < totalAmountInvestIn20Days) {
			int loss = totalAmountInvestIn20Days - amountafter20Days;
			System.out.println("Total loss after 20 days is = " + loss);
		} else
			System.out.println("No profit No loss");
	}

	public static void main(String[] args) {
		calculateTotalAmount();
	}

}
