package day03;

import java.util.Locale;
import java.util.Scanner;

public class StringADV {
    public static void main(String[] args) {
        String icecream = "chocolate";

        // icecream.length(); 몇 글자인지 알려줌
        // icecream.charAt(3); 0, 1, 2, 3번째의 알파벳을 돌려줌
        // icecream.substring(0, 3); 0~2번째 까지 짤라서 돌려줌
        // icecream.contains("co"); "co"를 갖는지 true/ false로 알려줌
        // icecream.indexOf("h") "h"는 몇번째인지 돌려줌 없으면 -1 돌려줌
        // icecream.equals("choco") "choco"랑 똑같은지 물어봄 true/false로 돌려줌
        // icecream.equalsIgnoreCase("CHOCOLATE") 대소문자 상관없이 같은지 물어봄 true/false
        // icecream.toUpperCase() 대문자화 시켜줌
        // icecream.toLowerCase() 소문자화 시켜줌
        // icecream.replace("a","b") "a"를 "b"로 바꿔줌
        // icecream.replaceALL("a","b") "a"를 "b"로 모두 바꿔줌
        // icecream.startsWith("choco") "choco"로 시작하니? true/false




        // 유저에게 비밀번호 설정을 입력 받고, 비밀번호 길이가 8글자 이상이고 !표를 포함하면
        // 올바르게 설정했습니다. 아니면 다시설정해주세요.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("비밀번호를 설정하시오: ");
//        String password = sc.next();
//        //boolean isLengthOver8 = password.length() >= 8; //줄이기
//        //boolean hasExclamation = password.contains("!"); //줄이기
//
//        String result = password.length() >= 8 && password.contains("!") ? "올바르게 설정했습니다." : "다시설정해주세요.";
//        System.out.println(result);





    }
}
