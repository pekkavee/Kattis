package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder Adrian = new StringBuilder("ABC");
        StringBuilder Bruno = new StringBuilder("BABC");
        StringBuilder Goran = new StringBuilder("CCAABB");
        int a = 0;
        int b = 0;
        int g = 0;

        int x = Integer.parseInt(sc.nextLine());
        String y = sc.nextLine();
        for (int i = 0; i < x; i++) {
            if (Adrian.length() < x)
                Adrian.append(Adrian);
            if (Bruno.length() < x)
                Bruno.append(Bruno);
            if (Goran.length() < x)
                Goran.append(Goran);
        }

        for (int i = 0; i < x; i++) {
            char o = y.charAt(i);
            if (Bruno.charAt(i) == o)
                b++;
            if (Adrian.charAt(i) == o)
                a++;
            if (Goran.charAt(i) == o)
                g++;

        }

        ArrayList<Integer>numerot=new ArrayList<>();
        numerot.add(a);
        numerot.add(g);
        numerot.add(b);
        Collections.sort(numerot);
        int paras=numerot.get(2);

        System.out.println(paras);

        if (a >= b && a >= g) {

            System.out.println("Adrian");

        }

        if (b >= a && b >= g) {

            System.out.println("Bruno");
        }
        if (g >= a && g >= b) {

            System.out.println("Goran");
        }

    }
}
