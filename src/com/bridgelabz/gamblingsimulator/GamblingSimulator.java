package com.bridgelabz.gamblingsimulator;
/*Problem Statement
 * UC-1 As a Gambler, would start with a stake of $100 every day and bet $1 every game.
 */
public class GamblingSimulator {
			// create method
	public static void startGambling() {
		/*
		 * final keyword to take constant value
		 */
		final int STAKE = 100;
		final int BET = 1;
		System.out.println("Welcome To Gambling Simulator.");
		System.out.println("Gambler start with stake of $" + STAKE + " every day");
		System.out.println("Gambler bet for $" + BET + " every game");
	}
	// main method
	public static void main(String[] args) {
		// method calling
		startGambling();
	}
}
