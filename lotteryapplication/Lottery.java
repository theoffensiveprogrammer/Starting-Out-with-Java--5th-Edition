/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lotteryapplication;

/**
 *
 * @author KeshavKumar
 */




import java.util.Random;
import java.util.Scanner;

class Lottery {

	/**
	 * The lottery numbers.
	 */
	private int lotteryNumbers[];

	/**
	 * Default Constructor.
	 *
	 * The class should use the Random class (from the Java API) to generate a
	 * random number in the range of 0 through 9 for each element in the array.
	 */
	public Lottery() {
		Random rand = new Random(System.currentTimeMillis());
		lotteryNumbers = new int[5];
		for (int i = 0; i < lotteryNumbers.length; i++) {
			lotteryNumbers[i] = rand.nextInt(10);
		}
	}

	/**
	 * The class should also have a method that accepts an array of 5 integers
	 * that represent a person's lottery picks. The method is to compare the
	 * corresponding elements in the two arrays and return the number of digits
	 * that match.
	 */
	 public int compareNumbers(int[] usersNumbers) {
	 		int match = 0;
	 		if (usersNumbers.length == lotteryNumbers.length) {
	 			for (int i = 0; i < lotteryNumbers.length; i++) {
	 				if (usersNumbers[i] == lotteryNumbers[i]) {
	 					match++;
	 				}
	 			}
	 		}
	 		return match;
	}


	/**
	 * In addition, the class should have a method that returns a copy of the
	 * lotteryNumbers array.
	 */
	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}
}
