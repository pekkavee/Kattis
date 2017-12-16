package Kattis;

import java.util.Scanner;

/**
 * Created by Administrator on 14.12.2017.
 */
public class Cold_puter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int underZero = 0;

        for (int i = 0; i < cases; i++) {
            if(sc.nextInt()<0) {
                underZero++;
            }

        }
        System.out.println(underZero);
    }
}
