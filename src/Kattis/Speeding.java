package Kattis;

import java.util.Scanner;

public class Speeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int maxSpeed =0;
        int hour = sc.nextInt();
        int miles = sc.nextInt();

        while (x-1>0) {
            int hourA = sc.nextInt();
            int milesA = sc.nextInt();

            int speed = (milesA-miles)/(hourA-hour);
            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
            hour = hourA;
            miles = milesA;
            x--;

        }

        System.out.println(maxSpeed);

    }
}
