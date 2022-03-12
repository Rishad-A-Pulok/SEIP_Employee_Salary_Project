package Employee;

public class HourlySalariedEmp extends Employee{
    double totalHour,hourlyRate;

    public HourlySalariedEmp(double totalHour, double hourlyRate) {
        this.totalHour = totalHour;
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return totalHour*hourlyRate;
    }
}
