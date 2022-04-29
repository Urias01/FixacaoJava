/*
    Name: AulaVetor.java
    Author: Urias Pereira
    Date: 29/04/2022
    Description: Aprendendo sobre vetores

*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class AulaVetor {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] vector = new double[n];

    for (int i = 0; i < n; i++) {
      vector[i] = sc.nextDouble();
    } // Finish for

    double sum = 0.0 ;
    
    for (int i = 0 ; i < n ; i++) {
        sum += vector[i];
    } // Finish for

    double avg = sum / n;

    System.out.printf("Average: %.2f \n", avg);

    sc.close(); // Finish Scanner
  }
}
