package Done;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;


        int luku2 = 0;
        for (int i = 0; i < x; i++) {
            String y = sc.next();
            int luku = Integer.parseInt(y.substring(0, y.length() - 1));
            int p = Integer.parseInt(y.substring(y.length() - 1, y.length()));

            luku2 = (int) Math.pow(luku, p);
            sum += luku2;
        }

        System.out.println(sum);
    }
}

