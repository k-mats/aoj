package jp.kmats.aoj.ITP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ITP1_3_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            int input = Integer.parseInt(scanner.next());
            if (input == 0) {
                break;
            }
            list.add(input);
        }

        IntStream.range(0, list.size())
                .forEach(i -> System.out.println("Case" + " " + (i + 1) + ": " + list.get(i)));
    }
}
