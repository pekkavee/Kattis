package Done;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        sc.close();
        int x =3;
        int y = 3;
        int z = 3;

        int points;



        for (int i = 1; i < iterations; i++) {
            z=z+z-1;

        }

        System.out.println((z)*(z));
    }

}

