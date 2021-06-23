package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		if ( resp == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			Account account = new Account(number, holder, balance);
			
			System.out.println();
			System.out.print("Account data:\n" + account);
		}
		else {
			Account account = new Account(number, holder);
			
			System.out.println();
			System.out.print("Account data:\n" + account);
		}
		
		
		sc.close();
	}

}
