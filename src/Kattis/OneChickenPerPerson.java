package Kattis;

import java.util.Scanner;

/**
 * Created by Administrator on 14.12.2017.
 */
public class OneChickenPerPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a<b) {
            System.out.println(
                    "Dr. Chaz will have " + (b-a) + " pieces of chicken left over!"
            );
        } else {
            System.out.println("Dr. Chaz needs"+ (a-b)+ "more pieces of chicken!");
        }
    }

}
