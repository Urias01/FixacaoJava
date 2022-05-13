package generics.app;

import java.util.Scanner;

import generics.services.PrintService;

public class Program {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print(); 
        Integer x = ps.first();
        System.out.println(x);
        System.out.println("First: " + ps.first());
        sc.close();
    }
}
