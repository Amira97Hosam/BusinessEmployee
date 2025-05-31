public class Intern extends Employee{
    //Constructors:
    public Intern(int id , String name , double baseSalary){
        super( id , name , baseSalary);
    }
    //Methods :


    @Override
    public double calculateSalary() {
        return 3000;
    }
}
