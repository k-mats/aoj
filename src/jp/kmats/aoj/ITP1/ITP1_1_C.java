package jp.kmats.aoj.ITP1;

import java.util.Scanner;

public class ITP1_1_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int area = a * b;
        int perimeter = 2 * a + 2 * b;

        System.out.println(area + " " + perimeter);
    }
}
