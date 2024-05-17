package day03;

import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇년생인가요?");
        int a = sc.nextInt();
        int age = 2025 - a;
        System.out.println("당신은" + age + "살이시군요!");

        System.out.println("반지름을 입력하세요.");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("원의 넓이는 " + area + "cm입니다.");


    }
}
