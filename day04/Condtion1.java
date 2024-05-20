package day04;

import java.util.Scanner;

public class Condtion1 {
    public static void main(String[] args) {
       //if ~ else
//        int num = -1;
//
//        if(num > 0){
//            System.out.println("양수입니다.");
//        }else if(num == 0){
//            System.out.println("0 입니다.");
//        }else{
//            System.out.println("0 또는 음수입니다.");
//        }

        //Scanner sc = new Scanner(System.in);
//        int score = sc.nextInt();
//
//        if(score >= 90){
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else{
//            System.out.println("과락");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("x 입력");
//        int x = sc.nextInt();
//        System.out.println("y 입력");
//        int y = sc.nextInt();
//
//        if(x> 0 && y>0){
//            System.out.println("1사분면");
//        } else if (x < 0 && y > 0) {
//            System.out.println("2사분면");
//        } else if (x < 0 && y < 0){
//            System.out.println("3사분면");
//        } else if (x > 0 && y < 0){
//            System.out.println("4사분면");
//        } else if(x ==0 && y == 0) {
//            System.out.println("원점");
//        } else if(x == 0){
//            System.out.println("x축에 있습니다.");
//        } else if(y == 0) {
//            System.out.println("y축에 있습니다.");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호를 설정하세요: ");
        String password = sc.next();

        boolean isValidLength = password.length() >= 10;
        boolean hasSpecialChar = password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$");
        boolean startWithApple = password.startsWith("apple");

        if(!isValidLength){
            System.out.println("길이를 10글자 이상 작성하세요.");
        } else if (!hasSpecialChar) {
            System.out.println("반드시 !@#$가 포함되어야합니다.");
        } else if (!startWithApple) {
            System.out.println("반드시 apple로 시작되어야합니다.");
        } else {
            System.out.println("올바르게 설정하였습니다.");
        }


//        if(password.length() >= 10) {
//            System.out.println("10글자확인되었습니다.");
//        } else {
//            System.out.println("10글자 이하입니다.");
//        }
//        if(password.contains("!") && password.contains("@") && password.contains("#") && password.contains("$")){
//            System.out.println("!,@,#,$가 포함되지 않았습니다.");
//        } else if(password.startsWith("apple")){
//            System.out.println("올바르게 비밀번호 설정하였습니다.");
//        } else{
//            System.out.println("apple로 시작되어야합니다.");
//        }

        System.out.println("구매금액은?");
        int price = sc.nextInt();

        if(price >= 200000){
            double discountPrice = price * 0.8;
            System.out.println("총 구매 금액은" + discountPrice + "입니다.");
        } else if (price >= 100000) {
            double discountPrice = price * 0.9;
            System.out.println("총 구매 금액은" + discountPrice + "입니다.");
        } else if (price >= 50000) {
            double discountPrice = price * 0.95;
            System.out.println("총 구매 금액은" + discountPrice + "입니다.");
        }else{
            System.out.println("총 구매 금액은" + price + "입니다.");
        }


    }
}
