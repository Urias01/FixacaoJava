package exercisefixation03.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercisefixation03.model.entities.Contract;
import exercisefixation03.model.entities.Installment;
import exercisefixation03.model.services.ContractService;
import exercisefixation03.model.services.PaypalService;

public class Program {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data:");
        System.out.print("Number: ");
        int contractNumber = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date contractDate = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();
        
        Contract contract = new Contract(contractNumber, contractDate, contractValue);
        
        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();
        
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

    ;
        System.out.println("Installments:");
        for(Installment x : contract.getInstallments()) {
            System.out.println(x);
        }

        sc.close(); 
    }
    
}
