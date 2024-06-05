package day10.Company.Company;

public class Regular extends Worker {

    private double HourlyRate = 0.9;

    public Regular(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double pay(){
        return super.getSalary() * this.HourlyRate;
    }
}
