package day05;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //for문

//        for(int i=0; i<5; i++){
//            System.out.println("i는 " + i);
//            System.out.println("오늘 수요일");
//        }

        for(int i=0; i<=100; i++){
            System.out.println(i);
        }

       Scanner sc = new Scanner(System.in);
        System.out.println("n의 값을 입력하세요");
        int n = sc.nextInt();

        for(int i=0; i <= n; i++){
            System.out.println(i);
        }

        System.out.println("m과 l을 입력하세요");
        int m = sc.nextInt();
        int l = sc.nextInt();

        for(int i = m; i <= l; i++){
            System.out.println(i);
        }















    }
}
