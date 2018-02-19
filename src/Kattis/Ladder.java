package Done;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        sc.close();

        int pituus = (int) (a/(Math.sin(Math.toRadians(b))));
        System.out.println(pituus+1);

    }
}
