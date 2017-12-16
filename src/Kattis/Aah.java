package Kattis;

import java.util.Scanner;

/**
 * Created by Administrator on 13.12.2017.
 */
public class Aah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length()>=b.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
