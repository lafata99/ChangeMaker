package business;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

		double price;
		double samount;

		System.out.println("Change Maker");
		//ask for price of item
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the price of item:  $");
		//ask for how much was given
		price = in.nextDouble();
		System.out.print("Enter the dollars that are given:  $");
		samount = in.nextDouble();
		//call for method
		getChange(price, samount);

		}

	public static void getChange(double price, double samount) {
		double totalCents;
		int dollars;
		int quarters;
		int dimes;
		int nickles;
		int pennies;
		
		//format numbers
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);

		double change = samount - price;

		totalCents = (samount - price) * 100;

		System.out.println("Your change is:  $" + df.format(change));

		dollars = (int) totalCents / 100;
		totalCents = totalCents % 100;

		quarters = (int) totalCents / 25;
		totalCents = totalCents % 25;

		dimes = (int) totalCents / 10;
		totalCents = totalCents % 10;

		nickles = (int) totalCents / 5;
		totalCents = totalCents % 5;

		pennies = (int) totalCents;

		System.out.println("Dollars:  " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("nickles: " + nickles);
		System.out.println("Pennies: " + pennies);

	}
}

