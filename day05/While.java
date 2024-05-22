package day05;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //for(int i=0;...)
//        int a = 0;
//        while(a<10){
//            System.out.println("수업 언제끝남?");
//            //1번. a++;
//            //2번. break;
//            a++;
//            if(a==7)break;
//        }
        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("숫자 1누르면 프로그램 끝");
//            int codeNumber = sc.nextInt();
//            if(codeNumber == 1)break;
//        }

        //1.


        while(true) {
            boolean isSystemOff = false;
            System.out.println("사칙연산 프로그램시작!");
            System.out.println("두 정수를 입력하세요");
            System.out.println("첫번째 정수");
            int first = sc.nextInt();
            System.out.println("두번째 정수");
            int second = sc.nextInt();
            System.out.println("원하는 결과를 누르세요.(0. 종료, 1.더하기, 2.빼기, 3.곱셈, 4.제곱, 5.나누기, 6.나머지");
            int program = sc.nextInt();
            int result;

            switch (program) {
                case 0:
                    isSystemOff = true;
                    break;
                case 1:
                    int Plus = first + second;
                    System.out.println(Plus);
                    break;
                case 2:
                    int subtract = first - second;
                    System.out.println(subtract);
                    break;
                case 3:
                    int multiplication = first * second;
                    System.out.println(multiplication);
                    break;
                case 4:
                    result = first;
                    for(int i = 1; i<=second; i++){
                        result *= first;
                    }
                    System.out.println(result);
                    break;
                case 5:
                    int divide = first / second;
                    System.out.println(divide);
                    break;
                case 6:
                    int remain = first % second;
                    System.out.println(remain);
                    break;
                default:
                    System.out.println("그 외 나머지 숫자는 번호 오류 다시 입력하세요.");
                    break;
            }
            if(isSystemOff)break;
            System.out.println("프로그램 종료합니다.");
        }
        













    }
}
