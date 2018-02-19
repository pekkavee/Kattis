package Done;

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hands = Integer.parseInt(sc.next());
        String suit = sc.next();
//        int hands = 1;
//        String suit = "S";
        int points = 0;

        for (int i = 0; i <hands*4 ; i++) {
            String x = sc.next();
//            String x= "KS";
            String eka = x.substring(0,1);
            String toka = x.substring(1,2);


            if (eka.equals("A")) {
                points+=11;

            } else if (eka.equals("T")) {
                points+=10;

            } else if (eka.equals("Q")) {
            points+=3;
            }
            else if (eka.equals("K")) {
            points+=4;
            } else if (eka.equals("J") && toka.equals(suit)) {
                points+=20;
            } else if (eka.equals("J")) {
                points+=2;
            } else if (eka.equals("9") && toka.equals(suit)) {
                points+=14;
            }

        }
        System.out.println(points);
    }
}
