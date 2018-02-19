package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class HelpPhd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<String>laskut = new ArrayList<>();


        for (int i = 0; i <x ; i++) {
            String u = sc.nextLine();
            laskut.add(u);
        }

        for (int i = 0; i <laskut.size() ; i++) {
            String r =laskut.get(i);
            if(r.charAt(0)=='P') {
                System.out.println("skipped");
            } else {
                String[] merkit = r.split("\\+");

                String eka = merkit[0];
               String toka =merkit[1];

                int a = Integer.parseInt(eka);
                int b = Integer.parseInt(toka);
                System.out.println(a+b);
            }

        }

    }
}
