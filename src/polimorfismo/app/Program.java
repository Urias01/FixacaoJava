/* 
    Name: Program.java
    Author: Urias Pereira
    Date: 05 Abril 2022
    Description: Exercise resolved Polimorfismo
*/
package polimorfismo.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import polimorfismo.entities.Employees;
import polimorfismo.entities.OutsourcedEmployee;

public class Program {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    List<Employees> list = new ArrayList<>();

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Employee #" + i + " data: ");
      System.out.print("Outsourced (y/n)? ");
      char ch = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Hours: ");
      int hours = sc.nextInt();
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      if (ch == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        list.add(
          new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)
        );
      } else {
        list.add(new Employees(name, hours, valuePerHour));
      } // End else

    } // End for

    System.out.println();
    System.out.println("PAYMENTS: ");

    for(Employees emp : list){
      System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    } // End for

    sc.close();
  } // End main
} // End Class
