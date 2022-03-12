import Employee.BaseSalariedEmp;
import Employee.CommissionedSalariedEmp;
import Employee.HourlySalariedEmp;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Employee Details");
        System.out.println("===============");
        BaseSalariedEmp bse = new BaseSalariedEmp(25000.0);
        HourlySalariedEmp hse = new HourlySalariedEmp(40.0,500.0);
        CommissionedSalariedEmp cse = new CommissionedSalariedEmp(25000.0,15000.0,4.5);
        System.out.println("Salary of Base Salaried Employee "+bse.getSalary());
        System.out.println("Salary of Hourly Salaried Employee "+hse.getSalary());
        System.out.println("Salary of Commission Salaried Employee "+cse.getSalary());
    }
}
