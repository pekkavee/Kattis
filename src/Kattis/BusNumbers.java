package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        ArrayList<Integer> bussit = new ArrayList<>();
        ArrayList<String> bussar = new ArrayList<>();
        ArrayList<String> ds = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            bussit.add(sc.nextInt());
        }
//        bussit.add(1);
//        bussit.add(2);
//        bussit.add(3);
//        bussit.add(4);
//        bussit.add(9);
//        bussit.add(5);
//        bussit.add(10);
//        bussit.add(11);

        Collections.sort(bussit);


        for (int i = 0; i < bussit.size(); i++) {
            int r;
            int s = bussit.get(i);

            int summa = 1;
            int d = 1;
            for (int j = i + 1; j < bussit.size(); j++) {
                r = bussit.get(j);

                if (s +d  == r) {
                    summa++;
                    d++;
                }

            }
            if (summa>2) {
                System.out.print(bussit.get(i));
                System.out.print("-");
                System.out.print(bussit.get(i + summa-1));
                System.out.print(" ");

                i += summa-1;
            }else {
                System.out.print(bussit.get(i));
                System.out.print(" ");
            }

        }
    }
}