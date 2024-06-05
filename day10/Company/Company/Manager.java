package day10.Company.Company;

public class Manager extends Worker {

    private double HourlyRate = 1;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double pay(){
        return super.getSalary() * this.HourlyRate;
    }
}
