package day10.Company.Company;

public class Intern extends Worker {
    private String name;
    private double salary;
    private double HourlyRate = 0.8;

    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double pay(){
        return super.getSalary() * this.HourlyRate;
    }
}
