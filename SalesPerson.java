public class SalesPerson extends Employee{
    //Attributes:
    private double commission;

    //Constructors:
    public SalesPerson(int id , String name , double baseSalary , double commission){
        super(id , name , baseSalary);
        this.commission = commission ;
    }
    //Setters& Getters :

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    //Methods :

    @Override
    public double calculateSalary() {
        return getBaseSalary() + commission;
    }
}
