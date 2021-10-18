package Kattis;

import java.util.Arrays;
import java.util.Scanner;


public class Nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        int sum = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);


        /*
        Alternative solution
        String numbers[] = sc.nextLine().split(" ");
        int sum = 0;

        for (String s: numbers) {
            int a = Integer.parseInt(s);
            sum = sum+a;

        }
        */


    }
}