package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();
        ArrayList<Integer> lukuM = new ArrayList<>();
        ArrayList<Integer> pituus = new ArrayList<>();

        int x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < x; i++) {

            String a = sc.nextLine();
            String[] lubut = a.split(" ");
            int t = Integer.parseInt(lubut[0]);
            int o = Integer.parseInt(lubut[1]);
            String[] testi = new String[t];
            lukuM.add(t);
            pituus.add(o);
            sanat.add("Test " + (i + 1));
            for (int j = 0; j < t; j++) {
                String r = sc.nextLine();
                testi[j] = r;

            }
            for (int j = testi.length - 1; j >= 0; j--) {
                sanat.add(testi[j]);


            }


        }
        for (int i = 0; i < sanat.size(); i++) {
            String xx = sanat.get(i);
            if (xx.contains("Test")) {
                System.out.println(xx);
            } else {
                for (int j = xx.length() - 1; j >= 0; j--) {
                    System.out.print(xx.charAt(j));

                }
                System.out.println();
            }
        }
    }
}
