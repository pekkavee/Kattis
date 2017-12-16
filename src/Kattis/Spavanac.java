package Kattis;

import java.util.Scanner;

/**
 * Created by Administrator on 14.12.2017.
 */
public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int d = 45;
        sc.close();

        int tunnit;
        int minuutit;

        int sum = h*60+m-d;


       if (sum <d && sum !=0 ) {
            tunnit = 23;
            minuutit = 60+m-d;

        } else {

        tunnit = sum/60;
        minuutit = sum%60;}


        System.out.println(tunnit +" "+ minuutit);
        }
}
