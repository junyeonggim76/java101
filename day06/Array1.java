package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] Englishscore = {60, 70, 60, 70, 90, 60, 70, 60, 70, 90, 60, 70, 60, 70, 90 ,60, 70, 60, 70, 90, 60, 70, 60, 70, 90, 60, 70, 60, 70, 60, 70, 60, 70, 90, 60, 70, 60, 70, 90, 60, 70, 60, 70, 90, 70, 60, 70, 90, 60, 70, 60, 70};
//        int[] math_scores = new int[5];
//        for(int i=0; i< Englishscore.length; i++){
//            System.out.println(i + 1 + "번 학생 점수:" +Englishscore[i]+ "점");
//        }

        //1. 유저에게 5명의 수학점수를 입력받고
        //1~5번째의 학생의 수학점수를 나타내고
        //10명의 학생의 수학점수 평균을 나타내기
        int [] math_score = new int[10];
        int sum = 0;
        for(int i =0; i<math_score.length; i++){
            System.out.println(i+1+"번째 학생 수학점수 입력:");
            math_score[i] = sc.nextInt();
        }
        for(int i = 0; i< math_score.length; i++){
            System.out.println(i+1 + "번째 학생 수학점수:"+math_score[i] );
            sum += math_score[i];
        }
        double average = sum / math_score.length;
        System.out.println("평균은 " + average + " 입니다.");
//        int sum = 0;
//        for(int i=0; i< 10; i++){
//            System.out.println((i+1)+"번째 학생의 수학점수를 입력해주세요:");
//            math_score[i] = sc.nextInt();
//            sum += math_score[i];
//        }
//        System.out.println("학생들의 수학 점수:");
//        for (int i = 0; i < 10; i++) {
//            System.out.println((i + 1) + "번째 학생의 점수: " + math_score[i]);
//        }
//        double average = sum / 10.0;
//        System.out.println("10명의 학생의 수학 점수 평균: " + average);
        // 평균 나타내기:자료값 더하고 목록만큼 나누기

        //유저에게 10명의 수학점수를 입력받고 1~10번째의 학생의 수학점수를 나타내고 10명의 학생의 수학점수 평균을 나타내기









    }
}
