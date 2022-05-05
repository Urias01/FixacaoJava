package abstractfixation.model.entities;

public class Physicalperson extends Tax{
    
    private Double healthSpending ;

    public Physicalperson() {
        super();
    }

    public Physicalperson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
        public double tax(){
            if(getAnnualIncome() < 20000.00){
                return (getAnnualIncome() * 0.15) - (healthSpending * 0.5); 
            } else{
                return (getAnnualIncome() * 0.25) - (healthSpending * 0.5); 
            }
            
        }

}
