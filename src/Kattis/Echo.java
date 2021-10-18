package Kattis;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int times = 3;

        for (int i = 0; i <times ; i++) {
            System.out.print(word);
            System.out.print(" ");

        }


    }
}

