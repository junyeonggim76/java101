package day07;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1,2,3,4,5};
        int[][] arr2 = new int[3][3];
        int[][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //System.out.println(arr3[0][1]); //arr3에 안에있는 123 456 789중에 0번째줄에 (0번째는 1)1번째 숫자 2

//        for(int i = 0; i<arr3.length; i++){
//            for(int j=0; j<arr3[i].length; j++){
//                System.out.println(arr3[i][j]);
//            }
//        }

        // 유저에게 빵 메뉴 3개를 입력 받고,
        // 커피 메뉴 3개를 입력 받은 후,
        // 빵 메뉴: a b c
        // 커피 메뉴: d e f
        Scanner sc = new Scanner(System.in);
//        String[][] menu = new String[2][3];

//        for(int i = 0; i< menu.length; i++){
//           for(int j=0; j<menu[i].length;j++){
//               if(i==0){
//                   System.out.println(j+"번째" +"빵");
//               }else{
//                   System.out.print(j+"번째" +"커피 입력: ");
//               }
//           }
//
//        }
//        for(int i = 0; i< menu.length; i++){
//            for(int j=0; j<menu[i].length;j++){
//                if(i==0){
//                    System.out.println(j+"번째" +"빵" + menu[i][j]);
//                }else{
//                    System.out.print(j+"번째" +"커피 "+menu[i][j]);
//                }
//            }
//
//        }
        //학생 4명
        // c언어, java, python 각각 점수를 입력 받고
        // java의 평균점수를 나타내는 코드 만들기

//        int[][] codescore = new int[4][3];
//        String[] course = {"C언어", "java", "python"};
//
//        for(int i = 0; i<codescore.length; i++){
//             for(int j=0; j<codescore[i].length; j++){
//                 System.out.print(i+"번째 학생의 "+course[j]+" 시험 점수 입력: ");
//                 codescore[i][j] = sc.nextInt();
//             }
//        }
//        int sum = 0;
//        for(int i =0; i<codescore.length; i++){
//            sum += codescore[i][1];
//        }
//        System.out.println("자바의 평균:" + (double)sum/4);










    }
}
