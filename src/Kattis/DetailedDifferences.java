package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<String>ekat = new ArrayList<>();
        ArrayList<String>tokat = new ArrayList<>();

        for (int i = 0; i <x ; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            ekat.add(a);
            tokat.add(b);

        }

        for (int i = 0; i <ekat.size() ; i++) {
            String c = ekat.get(i);
            String d = tokat.get(i);
            System.out.println(c);
            System.out.println(d);
            for (int j = 0; j <c.length() ; j++) {
                if (c.charAt(j)==d.charAt(j)) {
                    System.out.print(".");
                }else {
                    System.out.print("*");

            }

        }
            System.out.println();
            System.out.println();


            
        }
    }
}
