package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double l = Math.sqrt((w*w)+(h*h));
        ArrayList<Integer>numerot = new ArrayList<>();

        for (int i = 0; i <x ; i++) {
           numerot.add(sc.nextInt());

        }
        sc.close();

        for (int numero: numerot
             ) {
            if(numero<=l) {
                System.out.println("DA");
            }  else {
                System.out.println("NE");
            }

        }
    }
}
