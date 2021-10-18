package Kattis;

import java.util.Scanner;

public class JumboJavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int sum =0-x+1;
        while (x>0) {
            sum = sum+Integer.parseInt(sc.nextLine());
            x--;

        }
        System.out.println(sum);

    }
}
