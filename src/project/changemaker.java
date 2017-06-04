package project;

import java.util.Scanner;

public class changemaker {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Double cost, amtgivin, change, changetotal;
		
		System.out.println("Please enter a purchase total" + "\n$");
		cost = keyboard.nextDouble();		
		System.out.println("Please enter the amount of money given." + "\n$");
		amtgivin = keyboard.nextDouble();		
		
		if (cost > amtgivin){
			System.out.println("You still owe" + " $" + -(amtgivin - cost));
		}
		if (cost == amtgivin){
			System.out.println("You gave exact change. Thanks for making my life easy!");
		}
		if (cost < amtgivin){
			change = (amtgivin - cost);
			calculator(change);
		}
		
	}
	public static void calculator(double change) {
		Double penny, nickle, dime, quarter, fifty;
		
//		if ((change * 100 ) % )
	}
}
