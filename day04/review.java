package day04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = sc.next();

        boolean isContainSpecialChar = pw.contains("!") || pw.contains("#") || pw.contains("$");
        boolean startWithIT = pw.startsWith("IT") || pw.startsWith("it");
        boolean isValidLength = 8 <= pw.length() && pw.length() <= 20;

        boolean passOrNot = isContainSpecialChar && startWithIT && isValidLength;

        String result = passOrNot ? "비밀번호 올바르게 설정" : "비밀번호 설정 오류";
        System.out.println(result);
    }
}
