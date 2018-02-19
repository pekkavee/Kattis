package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Soylent {
    public static void main(String[] args) {

        ArrayList<Integer>kalorti = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <x ; i++) {
            int o = Integer.parseInt(sc.nextLine());
            kalorti.add(o);


        }
        for (int i = 0; i <kalorti.size() ; i++) {
            int t = kalorti.get(i);
            double kulutus = (double)t/(double)400;
            System.out.println((int)(Math.ceil(kulutus)));

        }
    }
}
