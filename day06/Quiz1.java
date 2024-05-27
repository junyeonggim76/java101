package day06;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.유저에게 email 주소를 3개 받고 [split]
        // 유저 아이디만 출력
        String[] emails = new String[3];
        for(int i = 0; i<emails.length; i++){
            System.out.println(i+"번째 이메일 입력:");
            String email = sc.nextLine();
            emails[i] = email.split( "@")[0];
        }
        for(int i = 0; i< emails.length; i++){
            System.out.println(i + "번째 이메일 아이디:"+ emails[i]);
        }
    }
}
