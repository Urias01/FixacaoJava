/* 
    Name: Salario.Java
    Author: Urias Pereira
    Date: 02 Maio 2022
    Description: Programa de fixação utilizando Vetor e Lista em java
                    para ler os funcionário e escolher qual deles vai 
                        ter um aumento salarial
*/
package application;

import entities.Employees;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

  public static void main(String[] args) {
      
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();

        System.out.print("How many employees will be Registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Employee #" + i + ":\n");

            System.out.print("Id: ");
            int id = sc.nextInt();
            
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            } // End while

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextInt();
            list.add(new Employees(id, name, salary));

        } // End for

        System.out.println("________________________");
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employees emp = list
            .stream()
            .filter(x -> x.getId() == id)
            .findFirst()
            .orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:

        System.out.println();
        System.out.println("List of employees:");
        for (Employees obj : list) {
            System.out.println(obj);
        }

    sc.close(); // End Scanner
  } // End Static main

  public static boolean hasId(List<Employees> list, int id) {
    Employees emp = list
      .stream()
      .filter(x -> x.getId() == id)
      .findFirst()
      .orElse(null);
    return emp != null;
  }
} // End Class
