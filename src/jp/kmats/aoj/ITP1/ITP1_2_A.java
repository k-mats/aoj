package jp.kmats.aoj.ITP1;

import java.util.Scanner;

public class ITP1_2_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        String operator;
        if (a > b) {
            operator = " > ";
        } else if (a < b) {
            operator = " < ";
        } else {
            operator = " == ";
        }

        System.out.println("a" + operator + "b");
    }
}
