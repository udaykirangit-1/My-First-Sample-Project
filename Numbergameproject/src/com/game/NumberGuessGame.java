package com.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessGame {

	public static void game() {

		Scanner sc = new Scanner(System.in);

		int k = 5;

		int number = (int) (1 + (100 * Math.random()));

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

					System.out.println("If you want hint please choose hint(for hint press the 1) or else");

					int hint = sc.nextInt();

					if (hint == 1) {

						System.out.println("For easy guess prees 3" + '\n' + "For Medium guess press 2");

						int hint2 = sc.nextInt();

						if (hint2 == 2) {

							int off = number / 2;

							System.out.println("This is the hint of your number" + off);
							continue;
						}
						
						

						int hint3 = sc.nextInt();

						if (hint3 == 3) {

							int ans = number + 2;

							System.out.println("This is nearest number of guess number " + ans);
						}

					}

				}

				if (j == k) {
					System.out.println("Sorry You Loose the game..!! Try again.");
				}

			}

		} catch (InputMismatchException e) {

			System.out.println("Enter only the numbers not a charcters..!! please paly again");
			game();
		}

		System.out.println("The number is " + number);

	}

}
