/* 
    Name: AulaVetor2.java
    Author: Urias Pereira
    Date: 29 Abril 2022
    Description: Aprendendo Vetor 2.0
*/

package application;

import entities.Vetor2;
import java.util.Locale;
import java.util.Scanner;

public class AulaVetor2 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Vetor2[] vector = new Vetor2[n];


        for (int i = 0 ; i < vector.length ; i++) {

            sc.nextLine();
            
            String name = sc.nextLine();
            double price = sc.nextDouble();
       
            vector[i] = new Vetor2(name, price);

        } // Finish for

        double sum = 0.0 ;

        for (int i = 0; i < vector.length ; i++) {
            sum += vector[i].getPrice();
        } // Finish for

        double avg = sum / n ;

        System.out.printf("Average price = %.2f \n", avg) ;

        sc.close(); // Finish Scanner

    } // Finish main
    
} // Finish class
