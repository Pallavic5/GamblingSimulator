package com.bridgelabz.gamblingsimulator;
/*Problem Statement
 * UC - 2 As a Gambler make $1 bet so either win or loose $1
 */
public class GamblerWinORLOOSE {
	/*
	 * stake means starting amount
	 * initialize variable
	 * Total stake value = $100
	 * Gambler make $1 bet
	 * create method
	 */	
	public static void winOrLoose() {
		int stakePerDay = 100;
		int betPerGame = 1;
		//take random number between 0 and 1
		int result = (int) Math.floor(Math.random() * 2);
		System.out.println("Value is " + result);
		if (result == 0) {
			System.out.println("Gambler loose the game.");
			stakePerDay--; // Decrement the stake value
		} else {
			System.out.println("Gambler won the game.");
			stakePerDay++; // Increment the stake value
		}
		System.out.println("Gambler having stake after bet are of $ " + stakePerDay);
	}
	//main method
	public static void main(String[] args) {
		System.out.println("Welcome To Gambling Simulator.");
		winOrLoose();
	}

}
