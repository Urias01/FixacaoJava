/*
    Name: MatrixFixação.java
    Author: Urias Pereira
    Date: 02 May 2022
    Description: Exercise fixation Matrix
*/
package application;

import java.util.Scanner;

public class MatrixFixação {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter size line matrix: ");
            int m = sc.nextInt();
            System.out.print("Enter size column matrix: ");
            int n = sc.nextInt();

            int[][] mat = new int[m][n];

            System.out.println("Enter value matrix: ");

            for (int i = 0; i < mat.length; i++){
                
                for (int j = 0; j < mat[i].length; j++){
                    mat[i][j] = sc.nextInt();
                } //End for 

            } //End for 
            
            System.out.println("\n");
            
            System.out.print("Enter with a number of matrix: ");
            int number = sc.nextInt();
            
            for (int i = 0; i < mat.length; i++){
                
			    for (int j=0; j<mat[i].length; j++) {

				    if (mat[i][j] == number) {
					    System.out.println("Position " + i + "," + j + ":");
                        if (j > 0) {
					        System.out.println("Left: " + mat[i][j-1]);
					    } if (j < mat[i].length - 1){
                            System.out.println("Right: " + mat[i][j+1]);
                        } if(i > 0){
                            System.out.println("Up: " + mat[i-1][j]);
                        }if(i < mat.length-1) {
                            System.out.println("Down: " + mat[i+1][j]);
                        }

                    } // End if
                    
                } // End for
                
            
            } //End for 


        sc.close(); // End Scanner

    } // End main

}// End Class
