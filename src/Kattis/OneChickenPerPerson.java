package Done;

import java.util.Scanner;

public class OneChickenPerPerson {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int erotus = Math.abs(x - y);


        if (x > y) {
            if (erotus == 1) {
                System.out.println("Dr. Chaz needs " + erotus + " more piece of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + erotus + " more pieces of chicken!");
            }
        } else if (y > x) {
            if (erotus == 1) {
                System.out.println("Dr. Chaz will have " + erotus + " piece of chicken left over!");
            } else {
                System.out.println("Dr. Chaz will have " + erotus + " pieces of chicken left over!");
            }

        }
    }
}

