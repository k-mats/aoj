package jp.kmats.aoj.ITP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ITP1_5_A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.lines().forEach(s -> {
            List<Integer> list = Arrays.stream(s.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int h = list.get(0);
            int w = list.get(1);

            if (h == 0 && w == 0) {
                return;
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        });
    }
}
