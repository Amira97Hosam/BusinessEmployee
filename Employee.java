public abstract class Employee {
    //Attributes:
   private int id;
   private String name;
   private double baseSalary;
   private static int employee_Count = 0 ;

   //Constructors :
    Employee(int id , String name , double baseSalary){
        this.id = id;
        this. name = name ;
        this.baseSalary = baseSalary ;
        employee_Count++;
    }

    public static String getEmployeeCount() {
        return "";
    }
    //Setters&Getters :


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static int getEmployee_Count() {
        return employee_Count;
    }

    public static void setEmployee_Count(int employee_Count) {
        Employee.employee_Count = employee_Count;
    }

    //Abstract Method :
    public abstract double calculateSalary();

    //Others Method :
    public void displayInfo (){
        System.out.println("ID :" + id);
        System.out.println("Name :" + name);
        System.out.println("Base Salary :" + baseSalary);
    }
}
