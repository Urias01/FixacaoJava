/*
    Name: Matrix.java
    Author: Urias Pereira
    Date: 02 May 2022
    Description: Aula 01 Matrix Java
*/
package app;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter size matrix: ");
            int n = sc.nextInt();
            int[][] mat = new int[n][n];

            for (int i = 0; i < mat.length; i++){
                
                for (int j = 0; j < mat[i].length; j++){
                    mat[i][j] = sc.nextInt();
                } //End for 

            } //End for 

            System.out.println("\n");
            System.out.println("Main diagonal: ");
            
            for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][i] + " ");
            } // End for
            
            System.out.println("\n");
            
            int count = 0 ;
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if(mat[i][j] < 0){
                        count++;
                    } // End if
                } // End for
            } // End for
            
            System.out.println("Negative numbers: " + count);



        sc.close(); // End Scanner

    } // End static Main
    
} // End class
