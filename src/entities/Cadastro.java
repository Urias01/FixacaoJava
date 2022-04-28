package entities;

public class Cadastro {

    private int numberAccount ;
    private String name, choose ;
    private double initialDeposit, balance ;
    private int quantity ;
    public String getChoose;

    public Cadastro(){}

    public Cadastro (
            int numberAccount, 
            String name, 
            double initialDeposit,
            String choose,
            double balance,
            int quantity
            ){
        this.numberAccount = numberAccount;
        this.name = name;
        this.initialDeposit = initialDeposit;
        this.choose = choose;
        this.balance = balance;
        this.quantity = quantity;
    }


    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }
    public int getNumberAccount(){
        return numberAccount;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getChoose(){
        return choose;
    }

    public void setInitialDeposit(double initialDeposit){
        this.initialDeposit = initialDeposit;
    }
    public double getInitialDeposit(){
        return initialDeposit;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public int getQuantity(){
        return quantity ;
    }
    

    
}
