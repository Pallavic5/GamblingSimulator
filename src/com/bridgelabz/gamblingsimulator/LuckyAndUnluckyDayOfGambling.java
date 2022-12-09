package com.bridgelabz.gamblingsimulator;
/*problem statement
 * UC-6 Would also like to know my luckiest day where I won maximum and my unluckiest day where I lost maximum
 */
public class LuckyAndUnluckyDayOfGambling {
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
	public static void showLuckyAndUnLuckyDay() {
		int totalAmountInvestIn20Days = 2000;
		int amountafter20Days = 0;
		for (int i = 1; i <= 20; i++) {
			int result = startGambling();
			amountafter20Days += result;
			//check condition for find out luckiest day and unluckiest day.
			if (result == 50) {
				System.out.println("Unlucky day Lost 50$ in day " + i);
			}
			if (result == 150) {
				System.out.println("Lucky day Won 50$ in day " + i);
			}
		}
		System.out.println("Amount after 20 day is " + amountafter20Days);
		if (amountafter20Days > totalAmountInvestIn20Days) {
			int profit = amountafter20Days - totalAmountInvestIn20Days;
			System.out.println("Total profit after 20 days is = " + profit);

		} else if (amountafter20Days < totalAmountInvestIn20Days) {
			int loss = totalAmountInvestIn20Days - amountafter20Days;
			System.out.println("Total loss after 20 days is = " + loss);
		} else
			System.out.println("No profit No loss");
	}
		//main method
	public static void main(String[] args) {
		showLuckyAndUnLuckyDay();
	}

}
