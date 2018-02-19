package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        //scanner reads numbers
        int eka = Integer.parseInt(in.next());
        int toka = Integer.parseInt(in.next());
        int kolmas = Integer.parseInt(in.next());

        // order
        String order = in.next();


        ArrayList<Integer> numerot = new ArrayList<Integer>();
        numerot.add(eka);
        numerot.add(toka);
        numerot.add(kolmas);
        Collections.sort(numerot);




        for (int i = 0; i < order.length() ; i++) {
            char kirjain= order.charAt(i);
            if (kirjain=='A') {
                System.out.print(numerot.get(0));
            } else if (kirjain=='B') {
                System.out.print(numerot.get(1));
            } else {
                System.out.print(numerot.get(2));
            }
            System.out.print(" ");

        }
    }
}

