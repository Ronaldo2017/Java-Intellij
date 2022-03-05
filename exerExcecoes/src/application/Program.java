package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws DomainException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		double initBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();

		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		Account account = new Account(number, name, initBalance, withDrawLimit);

		try {
			account.withDraw(amount);
			System.out.print("New balance: " + account.getBalance());

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}


	}
}
