package project;

import java.util.Scanner;

public class changemaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Double cost, amtGivin, changetotal;
		
		System.out.println("Please enter a purchase total" + "\n$");
		cost = keyboard.nextDouble();		
		System.out.println("Please enter the amount of money given." + "\n$");
		amtGivin = keyboard.nextDouble();		
		
		if (cost > amtGivin){
			System.out.println("You still owe" + " $" + -(amtGivin - cost));
		}
		if (cost == amtGivin){
			System.out.println("You gave exact change. Thanks for making my life easy!");
		}
		
	}

}
