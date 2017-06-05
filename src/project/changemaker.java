package project;

import java.util.Scanner;

public class changemaker {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Double cost = .01, amtgivin = .01, change, changetotal;
		while (cost != 0 && amtgivin != 0) {
			System.out.println("Enter 0 in both fields to quit");
			System.out.println("Please enter a purchase total");
			cost = keyboard.nextDouble();
			System.out.println("Please enter the amount of money given.");
			amtgivin = keyboard.nextDouble();

			if (cost > amtgivin) {
				System.out.println("You still owe" + " $" + -(amtgivin - cost));
			}
			if (cost == amtgivin) {
				System.out.println("You gave exact change. Thanks for making my life easy!");
			}
			if (cost < amtgivin) {
				change = (amtgivin - cost);
				change = change * 100;
				calculator(change);
			}
		}
	}

	public static void calculator(double change) {
		String[] bills = { "Twenties", "Tens", "Fives", "Ones", "Quarters", "Dimes", "Nickles", "Pennies" };
		String[] bill = { "Twenty", "Ten", "Five", "One", "Quarter", "Dime", "Nickle", "Penny" };
		int[] values = { 2000, 1000, 500, 100, 25, 10, 5, 1 };

		for (int counter = 0; counter < values.length; counter++) {
			int amount = (int) (change / values[counter]);
			change = (change % values[counter]);
			if (amount > 1) {
				System.out.println(amount + " " + bills[counter]);
			} else if (amount == 1) {
				System.out.println(amount + " " + bill[counter]);
			}
		}

	}
}
