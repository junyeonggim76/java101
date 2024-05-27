package day06;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //유저에게 5개의 커피 메뉴를 입력받고
        // 1번째 커피 메뉴: 모두 대문자로 나타내기
        // 2번째 커피 메뉴: 모두 대문자로 나타내기
        //...
        // 5번째 커피 메뉴: 모두 대문자로 나타내기
        Scanner sc = new Scanner(System.in);
        String[] menu= new String[5];


        //next()는 공백 전까지의 문자열을 읽습니다. 주로 단어 단위로 읽습니다.
        //nextLine()은 줄바꿈 문자를 포함하여 전체 라인을 읽습니다. 공백도 포함된 전체 문자열을 받습니다.
        for(int i =0; i<menu.length; i++){
            System.out.println("커피 이름과 가격을 입력[ex:아메리카노 5000]");
            menu[i] = sc.nextLine();
        }
        for(int i=0; i<menu.length; i++){
            System.out.println(i+1+"번째 커피: "+menu[i]+"원");
        }
        int sum = 0;
        for(int i=0; i<menu.length; i++){
            sum += Integer.parseInt(menu[i].split( " ")[1]);
        }
        double avg = (double)sum/ menu.length;
        System.out.println("가격 평균:"+ avg);












    }
}
