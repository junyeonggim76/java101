package day08;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        //cgv 판매 프로그램
        //1. 영화 구메[1. IT코리아 영화[8000원] 2. 집에 가고 싶다.] -> 몇명 -> ~~영화가 몇개 티켓으로 판매 되었습니다.
        //2. 음료 구매[1. 콜라[2500원] ] -> 몇명 -> ~~음료가 몇개 판매되었습니다.
        //3. 영화 추가 -> 영화제목: 집에가고 싶다. -> 완료되었습니다.
        //4. 음료 추가
        //5. 종료
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[10];
        int movieCount = 0;
        movies[movieCount++] = new Movie("IT코리아", 8000);

        while (true) {
            System.out.println("CGV 판매 프로그램");
            System.out.println("1. 영화 구매 2.음료 구매 3.영화 추가 4.음료 추가 5.종료");
            String codeNumber = sc.nextLine();
            switch (codeNumber) {
                case "1":
                    System.out.println("1.IT코리아 영화[8000원] 2.집에가고 싶다.");
                    for (int i = 0; i < movieCount; i++) {
                   //     System.out.println(i + "번째 " + movies[i].name + " " + movies[i].price);
                    }
                    System.out.println("번호 선택: ");
                    int movieNumber = sc.nextInt();
                    System.out.print("몇명입니까: ");
                    int people = sc.nextInt();
                    //System.out.println(movies[movieNumber].name + "영화가" + people + "개 티켓 판매 완료");
                    //System.out.println("총 금액: " + movies[movieNumber].price * people + "원");
                    break;
                case "3":
                    System.out.print("영화 이름 입력: ");
                    String movieName = sc.nextLine();
                    System.out.print("영화 가격 입력: ");
                    int moviePrice = sc.nextInt();
                    movies[movieCount++] = new Movie(movieName, moviePrice);
                    System.out.println("등록 완료!");
                    break;


            }


        }
    }
}

