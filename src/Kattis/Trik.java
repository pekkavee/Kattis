package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        sc.close();
        ArrayList<Integer> kupit = new ArrayList<>();
        kupit.add(1);
        kupit.add(2);
        kupit.add(3);
        int eka;
        int toka;
        int kolmas;


        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) == 'A') {
                eka=kupit.get(0);

                kupit.remove(kupit.get(0));

                kupit.add(1,eka);



            } else if (order.charAt(i)=='B') {
                toka =kupit.get(1);
                kupit.remove(kupit.get(1));



                kupit.add(2,toka);



            } else if (order.charAt(i)=='C') {
                kolmas=kupit.get(2);
                eka=kupit.get(0);
                kupit.remove(kupit.get(2));
                kupit.remove(kupit.get(0));

                kupit.add(0,kolmas);
                kupit.add(2,eka);

            }

        }
        int paikka = kupit.indexOf(1);
        System.out.println(paikka+1);
    }
}
