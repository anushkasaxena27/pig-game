package com.aurionpro.test;

import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diceRoll, totalScore = 0, turnScore = 0, turn = 1;
		char choice;

		System.out.println("\nTURN " + turn);

		while (totalScore <= 20) {
			System.out.println("Roll or Hold? (r/h) : ");
			choice = sc.next().charAt(0);
			switch (choice) {
			case 'r':
				diceRoll = (int) (Math.random() * 6 + 1);
				if (diceRoll == 1)
				{
					System.out.println("Die : " + diceRoll);
					System.out.println("Turn over. No score");
					turnScore = 0;
					turn += 1;
					System.out.println("\nTURN " + turn);
				}
				else
				{
					System.out.println("Die : " + diceRoll);
					turnScore += diceRoll;
				}
				break;
			case 'h':
				System.out.println("Score for turn : " + turnScore);
				totalScore += turnScore;
				System.out.println("Total Score : " + totalScore);
				
				if (totalScore <= 20)
				{
					turn += 1;
					System.out.println("\nTURN " + turn);
				}
				break;
				default:
					System.out.println("Wrong Choice Select a valid choice between r/h");
			}
		}
		//if(turn == 1)
			//System.out.println("\nYou finished in " + turn + " turn");
		//else 
			System.out.println("\nYou fininshed in " + turn + " turns");
		System.out.println("\nGame Over!\n");
	}
}
