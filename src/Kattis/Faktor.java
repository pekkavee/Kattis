package Done;

import java.util.Scanner;

/**
 * Created by Administrator on 13.12.2017.
 */
public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a*b;
        System.out.println(sum-a+1);
    }
}
