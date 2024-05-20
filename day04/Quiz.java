package day04;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //1.
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력: ");
        int num = sc.nextInt();
        if(num % 2 == 1 && num>0){
            System.out.println("양의 홀수");
        } else if (num % 2 == 0 && num>0) {
            System.out.println("양의 짝수");
        } else if (num % 2 == -1 && num<0){
            System.out.println("음의 홀수");
        } else if (num % 2 == 0 && num<0){
            System.out.println("음의 짝수");
        } else {
            System.out.println("0입니다.");
        }
        //2.
        System.out.println("첫 번째 정수");
        int first = sc.nextInt();
        System.out.println("두 번째 정수");
        int second = sc.nextInt();
        System.out.println("세 번째 정수");
        int third = sc.nextInt();

        if(first > second && first > third){
            System.out.println(first);
        } else if(second > first && second > third){
            System.out.println(second);
        } else{
            System.out.println(third);
        }

        //3.
        System.out.println("단어 입력: ");
        String word = sc.next();

        if(word == word.toUpperCase()){
            System.out.println(word.toLowerCase());
        } else{
            System.out.println(word.toUpperCase());
        }

        //4.
        System.out.println("버스 노선 선택(1. 시내버스 2. 광역버스 3. 마을버스)");
        int busType = sc.nextInt();
        int fare = 0;
        String bus;
        switch (busType){
            case 1:
                bus = "시내버스";
                fare = 1000;
                break;
            case 2:
                bus = "광역버스";
                fare = 2000;
                break;
            case 3:
                bus = "마을버스";
                fare = 1200;
                break;
            default :
                bus = "오류";
                fare = 0;
                System.out.println("잘못된 버스 타입 입니다.");
        }
        System.out.println("승객의 나이를 입력하세요.");
        int age = sc.nextInt();

        if(age <= 7 || 65 <= age){
            System.out.println(bus + "금액은" + fare + "입니다.");
        } else if(8 <= age && age <= 19){
            double doublefare = fare * 0.7;
            System.out.println(bus + "금액은" + doublefare + " 입니다.");
        } else {
            System.out.println(bus + "금액은" + fare + " 입니다.");
        }














    }
}
