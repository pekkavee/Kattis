package Done;

import java.io.BufferedReader;
import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int months = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <months ; i++) {
            int x = sc.nextInt();
            sum+=x;
        }

        int remaining = data*(months+1)-sum;
        System.out.println(remaining);
    }
}
