package day05;

import java.util.Scanner;

public class loop_Quiz {
    public static void main(String[] args) {
        //1.
        Scanner sc = new Scanner(System.in);
        System.out.println("n을 입력하세요.");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i=i+2){
            System.out.println(i);
        }
        //2.
        System.out.println("m을 입력하세요.");
        int m = sc.nextInt();
        int sum = 0;

        for(int i = 0; i <= m; i++){
            sum = sum + 1;
        }
        System.out.println(sum);
        //3.
        System.out.println("단어를 입력하세요");
        String msg = sc.next();
        System.out.println("l을 입력하세요");
        int l = sc.nextInt();
        int sum1 = 0;

        for(int i =0; i <= l; i++){
            System.out.println(i + msg);
        }

        //4.
        System.out.println("g를 입력하세요");
        int g = sc.nextInt();
        System.out.println("구구단을"+g+"단을 출력합니다.");
        for(int i = 1; i<=9; i++){
            System.out.println(i*g);
        }





    }
}
