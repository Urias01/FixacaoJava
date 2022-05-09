package exercisefixationexception.app;

import java.util.Locale;
import java.util.Scanner;

import exercisefixationexception.model.entities.Account;
import exercisefixationexception.model.exceptions.DomainException;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account data: ");

        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);
        
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try {
			account.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", account.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}

        sc.close();
    }
}
