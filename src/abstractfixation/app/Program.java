package abstractfixation.app;

import abstractfixation.model.entities.Legalperson;
import abstractfixation.model.entities.Physicalperson;
import abstractfixation.model.entities.Tax;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    List<Tax> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Tax payer #" + i + " data: ");
      System.out.print("Individual or company? (i/c)? ");
      char ch = sc.next().charAt(0);
      System.out.print("Name: ");
      String name = sc.next();
      System.out.print("Annual income: ");
      Double annualIncome = sc.nextDouble();

      if (ch == 'i') {
        System.out.print("Health expenditures: ");
        Double healthSpending = sc.nextDouble();
        list.add(new Physicalperson(name, annualIncome, healthSpending));
    } else {
        System.out.print("Number of employees: ");
        Integer employeeNumber = sc.nextInt();
        list.add(new Legalperson(name, annualIncome, employeeNumber));
      }
    }

    double sum = 0.0;
    System.out.println();
    System.out.println("TAXES PAID:");
    for (Tax tp : list) {
        double tax = tp.tax();
        System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
        sum += tax;
    }
    
    System.out.println();
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    sc.close();
  }
}
