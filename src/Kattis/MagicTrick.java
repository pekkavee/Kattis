package Kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MagicTrick {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        int possible=1;

        for (int i = 0; i <line.length() ; i++) {
            char a = line.charAt(i);
            int sum =0;
            for (int j = 0; j < line.length(); j++) {
                char b = line.charAt(j);
                if (b==a) {
                    sum++;
                }

            }
            if (sum>1) {
                possible=0;
                break;
            }

        }
        System.out.println(possible);

    }
}



