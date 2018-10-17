package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Rijeci {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(1);
        b.add(1);
        b.add(1);
        b.add(2);
        Scanner sc =new Scanner(System.in);

        int u =sc.nextInt();
        if (u>3) {
            for (int i = 3; i < u; i++) {
                a.add(a.get(i - 1) + a.get(i - 2));
                b.add(b.get(i - 1) + b.get(i - 2));
            }
        }
        System.out.print(a.get(u-1)+" "+b.get(u-1));

    }
}
