package abstractfixation.model.entities;

public class Legalperson extends Tax {
    
    private Integer employeeNumber ;

    public Legalperson() {
        super();
    }

    public Legalperson(String name, Double annualIncome, Integer employeeNumber) {
        super(name, annualIncome);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
        public double tax(){
            if(getEmployeeNumber() < 10){
                return (getAnnualIncome() * 0.16); 
            } else{
                return (getAnnualIncome() * 0.14); 
            }
            
        }

}
