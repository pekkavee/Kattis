package Kattis;

import java.util.Scanner;

/**
 * Created by Administrator on 14.12.2017.
 */
public class Abradacabra {
    public static void main(String[] args) {
        String x = " Abracadabra";
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for (int i = 1; i <=times ; i++) {
            System.out.println(i +x);

        }



    }
}
