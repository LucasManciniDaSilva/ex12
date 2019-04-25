package application;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount = sc.nextDouble();
		System.out.println("Enter the months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Total payments of "  + months + " months of rental is: " +payment);
		
		sc.close();

	}

}
