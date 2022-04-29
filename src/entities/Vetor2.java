/*
    Name: AulaVetor.java
    Author: Urias Pereira
    Date: 29 Abril 2022
    Description: Aprendendo sobre vetores
*/

package entities;

public class Vetor2 {
    
    private String name ;
    private double price ;

    public Vetor2(String name, double price){
        this.name = name ;
        this.price = price ;
    } // Finish Constructor

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }

    public void setPrice(double price){
        this.price = price ;
    }
    public Double getPrice(){
        return price ;
    }

} // Finish class
