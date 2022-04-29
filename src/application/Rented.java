/* 
    Name: Rented.java
    Author: Urias Pereira
    Date: 29 Abril 2022
    Description: fixing exercise 
*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RoomsRented;

public class Rented {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        RoomsRented[] room = new RoomsRented[10]; 
        
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();


        for (int i = 0 ; i < n ; i++){

            System.out.println();
            System.out.printf("Rent #" + i + ":\n");
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int rooms = sc.nextInt();

            room[rooms] = new RoomsRented(name, email);
            
        } // End for
        
        System.out.println();
        System.out.println("Busy rooms:");

        for (int i=0; i<10; i++) {
        
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            } // End if

        } // End for

        sc.close(); // end Scanner
        
    } // End main

} // End class