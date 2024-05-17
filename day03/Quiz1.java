package day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        //1. 영어점수를 입력받고, 60점 이상
        // 합격 입니다. 아니면 불합격 입니다.
//        System.out.println("영어 점수를 입력하시오: ");
//        Scanner sc = new Scanner(System.in);
//        int english_score = sc.nextInt();
//
//        String passOrNot = english_score  >= 60 ? "합격" : "불합격";
//        System.out.println(passOrNot + " 입니다.");

        //2. 정수를 입력받고, 양수인지 음수인지 알려주기
//        System.out.println("정수를 입력하시오: ");
//        int num = sc.nextInt();
//        String result = num > 0 ? "양수" : "음수";
//        System.out.println(result + "입니다.");

        //1. 두 정수를 입력받고, 큰 수를 출력하기
//        System.out.println("두 정수를 입력하시오:");
//        Scanner sc = new Scanner(System.in);
//        int first = sc.nextInt();
//
//        System.out.println("두 번째 수");
//        int second = sc.nextInt();
//        int bigger = first > second ? first : second;
//        System.out.println("큰 수는 " + bigger);
//
//        //2. 정수를 입력 받고, 절대값으로 바꾸기으로
//        System.out.println("숫자를 입력하시오: ");
//        int num =  sc.nextInt();
//        int absNum = num > 0 ? num : -num;
//        System.out.println("절대값은 " + absNum);
//
//        //3. 정수를 입력 받고, 홀수인지 짝수인지 알려주기
//        System.out.println("정수를 입력하시오: ");
//        int num1 = sc.nextInt();
//        String result = num1 % 2 == 1 ? "홀수" : "짝수";
//        System.out.println(num1 + "은 " + result + " 입니다.");
        //1. 이메일을 입력받고, 형식에 맞는지 체크하기
        // @포함해야하고, .을 포함해야하고, naver or gmail만 포함해야합니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("이메일을 입력하시오: ");
        String email = sc.next();
        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        boolean hasDomain = email.contains("naver") || email.contains("gmail");

        String emailResult = hasAt && hasDot && hasDomain ? "올바른 이메일" : "잘못된 이메일";
        System.out.println(emailResult);


        //2. 과일 이름을 입력받고, 6글자 이하이면 대문자화하고
        //아니면 앞에 3글자만 나타내기
        // ex) apple -> APPLE, strawberry-> str
        System.out.println("과일을 입력하시오: ");
        String fruit = sc.next();

        String result1 = fruit.length() <= 6 ? fruit.toUpperCase() : fruit.substring(0, 3);
        System.out.println(result1);







    }
}
