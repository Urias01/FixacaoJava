/* 
    Name: RoomsRented.java
    Author: Urias Pereira
    Date: 29 Abril 2022
    Description: fixing exercise 
*/
package entities;

public class RoomsRented {
    
    public String name ;
    public String email ;
    public int rooms ;

    public RoomsRented(String name, String email) {
        this.name = name;
        this.email = email;
    } // End Constructor()

    public String toString() {
        return name + ", " + email;
    } // End toString()

} // End class
