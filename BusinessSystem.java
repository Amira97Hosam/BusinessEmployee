import java.util.*;

public class BusinessSystem {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Predefined employees
        employeeList.add(new Manager(1, "Alice", 7000, 2000));
        employeeList.add(new SalesPerson(2, "Bob", 5000, 1500));
        employeeList.add(new Intern(3, "Charlie", 0));

        boolean running = true;
        while (running) {
            System.out.println("\n--- Business Employee Management System ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Total Payroll");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> viewTotalPayroll();
                case 4 -> running = false;
                default -> System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }

    private static void addEmployee() {
        System.out.println("\nSelect Role: 1. Manager  2. SalesPerson  3. Intern");
        int role = scanner.nextInt();
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Base Salary: ");
        double baseSalary = scanner.nextDouble();

        switch (role) {
            case 1 -> {
                System.out.print("Enter Bonus: ");
                double bonus = scanner.nextDouble();
                employeeList.add(new Manager(id, name, baseSalary, bonus));
            }
            case 2 -> {
                System.out.print("Enter Commission: ");
                double commission = scanner.nextDouble();
                employeeList.add(new SalesPerson(id, name, baseSalary, commission));
            }
            case 3 -> employeeList.add(new Intern(id, name, baseSalary));
            default -> System.out.println("Invalid role selected.");
        }
    }

    private static void viewEmployees() {
        for (Employee emp : employeeList) {
            System.out.println("\n--- Employee Info ---");
            emp.displayInfo();
            System.out.println("Total Salary: " + emp.calculateSalary());

            // Bonus: Display role
            if (emp instanceof Manager) System.out.println("Role: Manager");
            else if (emp instanceof SalesPerson) System.out.println("Role: SalesPerson");
            else if (emp instanceof Intern) System.out.println("Role: Intern");
        }
        System.out.println("\nTotal Employees: " + Employee.getEmployeeCount());
    }

    private static void viewTotalPayroll() {
        double total = 0;
        for (Employee emp : employeeList) {
            total += emp.calculateSalary();
        }
        System.out.println("Total Payroll: " + total);
    }
}