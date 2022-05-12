package herancamultipla.devices;

import herancamultipla.interfaces.Printer;

public class ConcreatPrinter extends Device implements Printer{

    public ConcreatPrinter(String serialNumber){
        super(serialNumber);
    }

    @Override 
    public void processDoc(String doc){
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
