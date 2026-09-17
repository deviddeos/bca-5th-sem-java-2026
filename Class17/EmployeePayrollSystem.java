abstract class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    double da;
    double hra;
    double bonus;

    public FullTimeEmployee(String name, double basicSalary){
        super(name, basicSalary);
    }

    public double 
        hra = getBasicSalary() * 0.20;
        da = getBasicSalary() * 0.10;
        bonus = getBasicSalary() * 0.05;

        return getBasicSalary() + hra + da + bonus;
    }
}
class PartTimeEmployee extends Employee {
    int totalTask;
    double payPerTask;
    public PartTimeEmployee(String name, int totalTask, double payPerTask ){
        super(name, 0);
        this.totalTask = totalTask;
        this.payPerTask = payPerTask;
    }

    public double calculateSalary() {
        return totalTask * payPerTask;
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Bob", 20000);
        System.out.println("The name of the Emp is : "+ e1.getName());
        System.out.println("Total salary is : "+ e1.calculateSalary());
        System.out.println("Basic Salary is : "+e1.getBasicSalary());
        Employee e2 = new PartTimeEmployee("Alic", 100, 200);
        System.out.println("The name of emp is : "+e2.getName());
        System.out.println("Total salary is : "+e2.calculateSalary());
    }   
}