package jp.kmats.aoj.ITP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ITP1_7_C {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list0 = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int r = list0.get(0);
        int c = list0.get(1);

        int[][] matrix = new int[r + 1][c + 1];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                int n = Integer.parseInt(scanner.next());
                matrix[i][j] = n;
                sum += n;
            }
            matrix[i][c] = sum;
        }

        for (int j = 0; j < c + 1; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum += matrix[i][j];
            }
            matrix[r][j] = sum;
        }

        for (int i = 0; i < r + 1; i++) {
            for (int j = 0; j < c + 1; j++) {
                System.out.print(matrix[i][j]);
                if (j < c) {
                    System.out.print(" ");
                }
            }
            if (i < r) {
                System.out.println();
            }
        }
    }
}
