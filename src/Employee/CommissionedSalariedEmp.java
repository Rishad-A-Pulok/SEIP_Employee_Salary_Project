package Employee;

public class CommissionedSalariedEmp extends BaseSalariedEmp{
    double salary, grossSale,commissionRate;

    public CommissionedSalariedEmp(double salary, double grossSale, double commissionRate) {
        super(salary);
        this.salary = salary;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


    @Override
    public double getSalary() {
        double newSalary = salary+((grossSale*commissionRate)/100);
        return newSalary;
    }
}
