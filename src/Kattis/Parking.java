package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<Integer>p=new ArrayList<>();

        for (int i = 0; i <x ; i++) {
            int u = Integer.parseInt(sc.nextLine());

            String s =sc.nextLine();
            String[]g=s.split(" ");
            ArrayList<Integer>shops =new ArrayList<>();
            for (int j = 0; j <g.length ; j++) {
                int o =Integer.parseInt(g[j]);
                shops.add(o);

            }
            Collections.sort(shops);
            int m = shops.get(shops.size()-1)-shops.get(0);
            m=m*2;
            p.add(m);

        }

        for (int u:p) {
            System.out.println(u);

        }

    }
}