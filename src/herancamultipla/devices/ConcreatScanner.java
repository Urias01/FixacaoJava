package herancamultipla.devices;

import herancamultipla.interfaces.Scanner;

public class ConcreatScanner extends Device implements Scanner {
    
    public ConcreatScanner(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan(){
        return "Scanned content" ;
    }
}
