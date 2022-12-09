package com.bridgelabz.gamblingsimulator;
/*problem statement
 * UC-4 After 20 days of playing every day would like to know the total amount won or lost.
 */
public class WinOrLostAmount {
	public static int startGambling() {
		int stakePerDay = 100;
		int betPerGame = 1;
		while(stakePerDay != 150 || stakePerDay != 50){
			int result = (int) Math.floor(Math.random() * 2);
			System.out.println("Value is " + result);
			if (result == 0) {
				System.out.println("Gambler loose the game.");
				stakePerDay--; // Decrement the stake value
			} 
			else {
				System.out.println("Gambler won the game.");
				stakePerDay++; // Increment the stake value
			}
			if(stakePerDay == 150) {
				System.out.println("Gambler win 50% of the stake.");
				break;
			}
			else if(stakePerDay == 50) {
				System.out.println("Gambler lost 50% of the stake.");
				break;
			}
		}
		return stakePerDay;	
	}
	//create method for calculate total amount.
	public static void calculateTotalAmount() {
		int totalAmountInvestIn20Days = 2000;
		int amountafter20Days = 0;
		for (int i = 1; i <= 20; i++) {
			amountafter20Days += startGambling();
		}
		System.out.println("After 20 days amount: " + amountafter20Days);
		// condition for calculate total amount after 20 days won or lost.
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
