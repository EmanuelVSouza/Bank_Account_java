package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);

		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);

			System.out.println();
			System.out.print("Account data:\n" + account + "\n");
		} else {
			account = new Account(number, holder);

			System.out.println();
			System.out.print("Account data:\n" + account + "\n");
		}

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.print("Updated account data:\n" + account + "\n");

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.print("Updated account data:\n" + account + "\n");

		sc.close();
		
	}

}
