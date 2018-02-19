package Done;

import java.util.Scanner;

public class RailRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        if (y%2==0) {
            System.out.println("possible");
        }else {
            System.out.println("impossible");
        }
    }
}
