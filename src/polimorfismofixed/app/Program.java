/* 
    Name: Program.java
    Author: Urias Pereira
    Date: 05 Abril 2022
    Description: Exercise Fixation Polimorfismo
*/
package polimorfismofixed.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import polimorfismofixed.entities.ImportedProduct;
import polimorfismofixed.entities.Product;
import polimorfismofixed.entities.UsedProduct;

public class Program {

  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<Product> list = new ArrayList<>();

    System.out.print("Enter the number of product: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Product: #" + i + " data: ");
      System.out.print("Common, used or imported (c/u/i)? ");
      char type = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Price: ");
      Double price = sc.nextDouble();

      if (type == 'i') {
        System.out.print("Customs fee: ");
        Double customsFee = sc.nextDouble();
        list.add(new ImportedProduct(name, price, customsFee));
      }
      if (type == 'u') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date manufactureDate = sdf.parse(sc.next());
        list.add(new UsedProduct(name, price, manufactureDate));
      }
      if (type == 'c') {
        list.add(new Product(name, price));
      } else {
        System.out.println("Invalid value!");
      }
    } // End for

    System.out.println();
    System.out.println("PRICE TAGS:");

    for (Product pdt : list) {
        System.out.println(pdt.priceTag());
    }

    sc.close();
  } // End main
} // End Class
