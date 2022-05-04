package heranca.aula1.app;

import java.util.Scanner;

import heranca.aula1.model.entities.Account;
import heranca.aula1.model.entities.SavingsAccount;

public class Program2 {
    
    public static void main(String[] args) {
            
            Scanner sc = new Scanner (System.in);
            
            Account x = new Account(1020, "Alex", 1000.0);
            Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

            x.withdraw(50.0);
            y.withdraw(50.0);
        
            System.out.println(x.getBalance());
            System.out.println(y.getBalance());

        sc.close();
    }

}
