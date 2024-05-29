package day07;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.유저에게 좋아하는 과일을 영어로 입력 받은 후 대문자로 배열에 저장해서 0~4번째 과일을 출력하기
        String[] fruits = new String[5];

        for(int i = 0; i<fruits.length; i++){
            System.out.println(i+"번째 과일 입력:");
            String fruit = sc.nextLine();
            fruits[i] = fruit.toUpperCase();
        }
        for(int i = 0; i<fruits.length; i++){
            System.out.println(i + "번째 과일:"+ fruits[i]);
        }
        //2. 유저에게 정수를 5개 입력 받은 후, 역으로 출력하기
        int[] arr = new int[5];

        for(int i = 0; i<arr.length; i++){
            System.out.println("정수를 입력하시오: ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[arr.length - 1 - i]);
        }
        //3. 유저에게 정수를 5개 입력 받은 후, 가장 큰 숫자만 출력하기
        int arrs[] = new int[5];

        for(int i = 0; i<arr.length; i++){
            System.out.println(i + "번째 정수 입력: ");
            arrs[i] = sc.nextInt();
        }
        int max = arrs[0];

        for(int i = 0; i<arrs.length; i++){
            if(max < arrs[i]) max = arr[i];
        }
        System.out.println(max);






    }
}
