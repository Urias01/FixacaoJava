package herancamultipla.app;

import herancamultipla.devices.ComboDevice;
import herancamultipla.devices.ConcreatPrinter;
import herancamultipla.devices.ConcreatScanner;

public class Program {

  public static void main(String[] args) {
   
    ConcreatPrinter p = new ConcreatPrinter("1080");
    p.processDoc("My Letter");
    p.print("My Letter");

    System.out.println();
    ConcreatScanner s = new ConcreatScanner("2003");
    s.processDoc("My Email");
    System.out.println("Scan result: " + s.scan());

    System.out.println();
    ComboDevice c = new ComboDevice("2081");
    c.processDoc("My dissertation");
    c.print("My dissertation");
    System.out.println("Scan result: " + c.scan());
  }
}
