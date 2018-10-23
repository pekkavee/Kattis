package Done_not_in_git;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        ArrayList<String> sentences = new ArrayList<>(2);
        for (int i = 0; i < h; i++) {
            String d = sc.nextLine();
            sentences.add(d);

        }
        for (int g = 0; g < sentences.size(); g++) {


            String s = sentences.get(g);
            int t = 0;
            int sq = (int) Math.ceil(Math.sqrt(s.length()));
            char[][] matrix = new char[sq][sq];


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (t == s.length()) {
                        matrix[i][j] = '*';

                    } else {
                        matrix[i][j] = s.charAt(t);
                        t++;
                    }

                }


            }
            for (int i = 0; i < sq; i++) {
                for (int u = matrix.length - 1; u >= 0; u--) {
                    char w = matrix[u][i];
                    if (w == '*') {

                    } else {
                        System.out.print(matrix[u][i]);
                    }


                }

            }
            System.out.println();
        }
    }
}
        


