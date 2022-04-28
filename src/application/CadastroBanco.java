package application;

import entities.Cadastro;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class CadastroBanco {
    
   public static void main(String[] args) {
       
    Locale.setDefault(Locale.US);
    
    
    try (Scanner scanner = new Scanner(System.in)) {

        Cadastro cadastro = new Cadastro();

        int quantity = 0 ;

        System.out.println("\n----------------------------------------------------");
        System.out.println("Enter the User data: ");
        
        System.out.print("Account number: ");
        int numberAccount = scanner.nextInt();
        
        System.out.print("Name: ");
        String name = scanner.next();
        
        System.out.print("Do you want enter with initial Deposit? (Y/N): ");
        String choose = scanner.next();

        double initialDeposit = 0.0 ;
        double balance = 0.0 ;

        cadastro = new Cadastro(numberAccount, name, initialDeposit, choose, balance, quantity);
        
        if(cadastro.getChoose().equals("y") || cadastro.getChoose().equals("yes")){ 

            System.out.print("Initial Deposit: ");
            initialDeposit = scanner.nextDouble();
            cadastro.setInitialDeposit(initialDeposit);
            System.out.println(cadastro.getInitialDeposit());
            balance = initialDeposit ;
            cadastro.setBalance(balance);

        }else if(cadastro.getChoose().equals("n") || cadastro.getChoose().equals("no")){
            
            System.out.print("Your initial deposit is 0");
            initialDeposit = 0.0 ;
            cadastro.setInitialDeposit(initialDeposit);
            balance = initialDeposit ;
            cadastro.setBalance(balance);

        }
        
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("Data account: ");
        System.out.println("Number Account: " + cadastro.getNumberAccount());
        System.out.println("User Name: " + cadastro.getName());
        System.out.println("Initial Deposit: " + cadastro.getInitialDeposit());
        System.out.println("\n----------------------------------------------------");
        
        System.out.print("Do you wan to do a deposit? (y/n): ");
        choose = scanner.next();

        if(cadastro.getChoose().equals("y") || cadastro.getChoose().equals("yes")){ 
            
            System.out.print("How many deposit you would want to do? ");
            quantity = scanner.nextInt();
            System.out.print("\n\n");
            
            for (quantity = quantity -1; quantity >= 0; quantity--) {
                
                System.out.print("Deposit: ");
                initialDeposit = scanner.nextDouble();
                cadastro.setInitialDeposit(initialDeposit);
                balance = balance + initialDeposit ;
                cadastro.setBalance(balance);
            }
            
        }else if(cadastro.getChoose().equals("n") || cadastro.getChoose().equals("no")){

            System.out.print("Your deposits made is 0");
            scanner.nextLine();
        }
        
        
        System.out.println("\n----------------------------------------------------\n\n");
        
        System.out.println("Account balance: " + cadastro.getBalance() );
    
        System.out.println("\n----------------------------------------------------\n\n");

        System.out.print("you want to withdraw any value? (y/n): ");
        choose = scanner.next();

        if(cadastro.getChoose().equals("y") || cadastro.getChoose().equals("yes")){ 
            
            System.out.print("How many deposit you would want to do? ");
            quantity = scanner.nextInt();
            System.out.print("\n\n");
    
            for (quantity = quantity -1; quantity >= 0; quantity--) {
                
                System.out.print("Deposit: ");
                initialDeposit = scanner.nextDouble();
                cadastro.setInitialDeposit(initialDeposit);
                balance = balance - initialDeposit ;
                cadastro.setBalance(balance);
            }
            
        }else if(cadastro.getChoose().equals("n") || cadastro.getChoose().equals("no")){
    
            System.out.print("Your deposits made is 0");
            scanner.nextLine();
        }

        System.out.println("\n----------------------------------------------------\n\n");

        System.out.println("Account balance: " + Math.round(cadastro.getBalance()));
       
        scanner.close();
    }

   }

}
