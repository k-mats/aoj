package jp.kmats.aoj.ITP1;

import java.util.Scanner;

public class ITP1_4_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.next());

        double area = r * r * Math.PI;
        double perimeter = 2.0 * r * Math.PI;

        System.out.printf("%6.6f %6.6f", area, perimeter);
    }
}
