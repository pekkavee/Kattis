package Kattis;

import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String numberBack = new StringBuilder(number).reverse().toString();
        System.out.println(numberBack);
    }
}
