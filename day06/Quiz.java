package day06;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CGV 프로그램");
        while(true){
            System.out.println("1. 영화 판매 2.음료 판매 3. 종료");
            int codeNumber = sc.nextInt();

            switch(codeNumber){
                case 1:
                    System.out.println("1. 어벤져스 2. 스파이더맨 3. 배트맨");
                    int movieNumber = sc.nextInt();
                    System.out.println("인원 수를 입력하시오: ");
                    int members = sc.nextInt();
                    String movieName = "";
                    if(movieNumber == 1){
                        movieName = "어벤져스";
                    } else if (movieNumber == 2) {
                        movieName = "스파이더맨";
                    } else if(movieNumber == 3 ){
                    movieName = "배트맨";
                    } else if(movieNumber == 4 ){
                        movieName = "에러";
                    }
                    System.out.println(movieName + "영화 티켓"+ members + "장을 판매했습니다!");
                    break;
                case 2:
                    System.out.println("1. 콜라 2. 사이다 3. 환타");
                    int bevergeNumber = sc.nextInt();
                    System.out.println("인원 수 입력:");
                    String bevergeName = sc.next();
                    if(bevergeNumber == 1){
                        bevergeName = "콜라";
                    } else if (bevergeNumber == 2) {
                        bevergeName = "사이다";
                    } else if(bevergeNumber == 3 ){
                        bevergeName = "환타";
                    } else if(bevergeNumber == 4 ){
                        bevergeName = "에러";
                    }
                    System.out.println(bevergeNumber + "음료를"+ bevergeName +"잔을 판매했습니다!");
                    break;
                case 3:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    break;
            }

        }







    }
}
