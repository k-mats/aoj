package jp.kmats.aoj.ITP1;

import java.util.Scanner;

public class ITP1_2_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        String answer = (a < b && b < c) ? "Yes" : "No";

        System.out.println(answer);
    }
}
