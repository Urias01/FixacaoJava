/*
    Name: Date.java
    Author: Urias Pereira
    Date: 04 May 2022
    Description: Aulas de data
*/
package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;
public class Data {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
       
        Date y1 = sdf1.parse("02/05/2022");
        Date y2 = sdf2.parse("03/05/2022 16:39:07");
        Date y3 = Date.from(Instant.parse("2022-05-02T16:51:15Z"));
        
        
        System.out.println("\nx1:" + sdf2.format(x1));
        System.out.println("\nx2:" + sdf2.format(x2));
        System.out.println("\nx3:" + sdf2.format(x3));
        System.out.println("\nx4:" + sdf2.format(x4));
        System.out.println("\ny1:" + sdf2.format(y1));
        System.out.println("\ny2:" + sdf2.format(y2));
        System.out.println("\ny3:" + sdf2.format(y3));
 
        System.out.println("\n-------------------------------");

        System.out.println("\nx1:" + sdf3.format(x1));
        System.out.println("\nx2:" + sdf3.format(x2));
        System.out.println("\nx3:" + sdf3.format(x3));
        System.out.println("\nx4:" + sdf3.format(x4));
        System.out.println("\ny1:" + sdf3.format(y1));
        System.out.println("\ny2:" + sdf3.format(y2));
        System.out.println("\ny3:" + sdf3.format(y3));

        System.out.println("\n");
    } // End Main 

} // End Class
