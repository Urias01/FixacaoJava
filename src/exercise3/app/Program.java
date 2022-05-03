/* 
    Name: Program.java
    Author: Urias Pereira
    Date: 03 Abril 2022
    Description: Exercise Fixation Enums ,Composição
*/
package exercise3.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercise3.model.entities.Client;
import exercise3.model.entities.Order;
import exercise3.model.entities.OrderItem;
import exercise3.model.entities.Product;
import exercise3.model.enums.OrderStatus;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

            SimpleDateFormat  sdf = new  SimpleDateFormat ( "dd/MM/yyyy" );

            System.out.println("Enter cliente data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Birth Date (DD/MM/YYYY): ");
            Date birthDate = sdf.parse(sc.next());


            Client client = new Client(name, email, birthDate);

            System.out.println("Enter order data:");
            System.out.print("Status: ");
            OrderStatus status = OrderStatus.valueOf(sc.next());
            

            Order order = new Order(new Date(), status, client);

            System.out.print("How many items to this order? ");
            int n = sc.nextInt();
            
            for(int i = 0; i < n; i++){
                System.out.println("Enter #" + i + " item data: ");
                
                System.out.print("Product name: ");
                sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Product price: ");
                double productPrice = sc.nextDouble();
                
                Product product = new Product(productName, productPrice);
                
                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                
                OrderItem orderItem = new OrderItem(quantity, productPrice, product);

                order.addItem(orderItem);
            } // End for
            
        sc.close(); // End Scanner
            
        System.out.println("\n");
        System.out.println("ORDER SUMMARY:");
        System.out.println("\n");
        System.out.println(order);


    } // End main 

} // End Class
