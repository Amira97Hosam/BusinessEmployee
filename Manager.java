public class Manager extends Employee {
    //Attributes :
    private double bonus;
    //Constructors :
    public Manager (int id , String name , double baseSalary , double bonus){
     super(id , name , baseSalary) ;
     this.bonus = bonus ;
    }
    //Setters & Getters :

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Methods :

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus ;
    }
}
