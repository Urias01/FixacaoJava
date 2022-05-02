/* 
    Name: Lista.java
    Author: Urias Pereira
    Date: 29 Abril 2022
    Description: Learning List in Java
*/
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Mariana");

        list.add(2, "Bruno");
        
        for (String x : list) {
            System.out.println(x);
        } // End for
        System.out.println("______________________");
        
        list.removeIf(x -> x.charAt(0) == 'M');
        
        for (String x : list) {
            System.out.println(x);
        } // End for
        System.out.println("______________________");
        
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        
        System.out.println("______________________");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        for (String x : result) {
            System.out.println(x);
        } // End for
        System.out.println("______________________");

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
   
    }
}
