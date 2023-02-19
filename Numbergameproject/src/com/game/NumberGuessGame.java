package com.game;

import java.util.InputMismatchException;

import java.util.Scanner;

public class NumberGuessGame {

	static int number = (int) (1 + (100 * Math.random()));

	// public static void main(String[] args) {

	public static void game() {

		Scanner sc = new Scanner(System.in);

		int k = 5;

		System.out.print("Give a number from 1 to 100" + '\n' + "You have 5 chances to guess" + '\n');

		int i;
		try {
			for (int j = 1; j <= k; j++) {

				System.out.println("Guess the number");

				i = sc.nextInt();

				if (i < number) {
					System.out.println("Your enterd number is samller than guees number");
				}

				else if (i > number) {
					System.out.println("Your enterd number is biger than guees number");
				}

				else {
					System.out.println("You won the game this is the number " + number);
					break;

				}

				if (j == 4) {

					System.out.println(
							"If you want hint please choose hint(for hint press the '1') or else to continue '0'");

					int hint = sc.nextInt();

					if (hint == 1) {

						System.out.println("For Easy Guess Press `1` or For Hard Guess Press `2`");

						int num = sc.nextInt();

						switch (num) {

						case 1:
							offmethod();
							break;

						case 2:
							nearNumber();
							break;
						}

					}

				}

				if (j == k) {
					System.out.println("Sorry You Loose the game..!! Try again.");
					System.out.println("The number is " + number);
				}

			}

		} catch (InputMismatchException e) {

			System.out.println("Enter only the numbers not a charcters..!! please paly again");
			game();
		}

	}

	public static void offmethod() {

		double off = (double) number / 2;

		System.out.println("this is the number " + off);

	}

	public static void nearNumber() {

		int ans = number + 2;

		System.out.println("this is the near number " + ans);

	}

}
