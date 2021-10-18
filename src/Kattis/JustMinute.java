package Kattis;

import java.util.Scanner;


public class JustMinute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sumOne =0;
        int sumTwo =0;
        double measurement;

        while (x>0) {
            sumOne = sumOne + sc.nextInt()*60;
            sumTwo = sumTwo + sc.nextInt();
            x--;



        }
        measurement= (double) sumTwo / (double) sumOne;
        if (measurement<=1) {
            System.out.println("measurement error");
        } else {
            System.out.println(measurement);
        }

    }
}