package Done_not_in_git;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x =sc.nextLine();
        sc.close();
        String[]luvut=x.split(" ");
        int[]luvut2 = {1,1,2,2,2,8};

        for (int i = 0; i <luvut.length ; i++) {
            int a = Integer.parseInt(luvut[i]);
            int g=luvut2[i]-a;
            System.out.print(g);
            System.out.print(" ");

        }

    }
}
