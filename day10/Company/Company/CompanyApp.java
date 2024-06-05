package day10.Company.Company;

//직원 월급 계산 프로그램
//worker 추상클래스[=shape]
//-HourlyRate
//-pay()
//인턴 클래스 0.8
//사원 클래스 0.9
//대리 클래스 1
public class CompanyApp {
    public static void main(String[] args) {
        Intern kim = new Intern("김인턴", 2700);
        Regular lee = new Regular("이정규",3300);
        Manager park = new Manager("박대리", 3600);

        System.out.println(kim.pay());
        System.out.println(lee.pay());
        System.out.println(park.pay());
    }
}
