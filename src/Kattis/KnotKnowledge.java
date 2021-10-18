package Kattis;

import java.util.Scanner;

public class KnotKnowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int num2 =0;
        String [] knots = sc.nextLine().split(" ");
        String [] known = sc.nextLine().split(" ");

        for (String s: knots) {

            for (String x: known) {
                if (x.equals(s)) {
                    num2++;
                }


            }
            if (num2==0) {
                System.out.println(s);
            }
            num2=0;

        }
    }
}
