package jp.kmats.aoj.ITP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ITP1_8_A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            char out = c;
            if (c >= 'a' && c <= 'z') {
                out = (char) (c - ('a' - 'A'));
            } else if (c >= 'A' && c <= 'Z') {
                out = (char) (c + ('a' - 'A'));
            }
            System.out.print(out);
        }
        System.out.println();
    }
}
