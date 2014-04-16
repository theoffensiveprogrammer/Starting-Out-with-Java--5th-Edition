/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lotteryapplication;


import java.util.Scanner;

public class LotteryApplication {
	public static void main(String[] args) {
		Lottery lottery = new Lottery();
		int lotteryNumbersCount = lottery.getLotteryNumbers().length;

		System.out.println("Lottery Application\n");
		System.out.println("There are " + lotteryNumbersCount
				+ " secret numbers in range of 0 through 9. "
				+ "Try to guess them!!!\n");

		// Asks the user to enter five numbers.
		Scanner kb = new Scanner(System.in);
		int numbers[] = new int[lotteryNumbersCount];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(String.format("Enter Number %d: ", i + 1));
			numbers[i] = kb.nextInt();


		}

		// Display the number of digits that match the randomly generate
		// lottery numbers.

		int match = lottery.compareNumbers(numbers);

		if (match == lotteryNumbersCount) {

			// If all of the digits match, display a message proclaiming the
			// user a grand prize winner.

			System.out.println("\nWOHOO! ALL CORRECT! YOU WON THE BIG PRIZE!");

		} else {

			System.out.println("\nUh-oh! You only hit " + match + " number(s).");

		}

	}
}