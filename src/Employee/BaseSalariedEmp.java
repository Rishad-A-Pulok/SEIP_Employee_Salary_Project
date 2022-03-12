package Employee;

public class BaseSalariedEmp extends Employee{
    double salary;

    public BaseSalariedEmp(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
