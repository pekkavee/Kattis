package Done;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IpcAwards2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<String> yliopistot2 = new ArrayList<>();
        ArrayList<String> joukkueet = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < x; i++) {
            String y = sc.nextLine();
            String[] sd = y.split(" ");
            String p = sd[0];

            yliopistot2.add(p);
            joukkueet.add(y);
        }

        Set<String> yliopistot = new LinkedHashSet<>(yliopistot2);
        yliopistot2.clear();
        yliopistot2.addAll(yliopistot);


        for (int i = 0; i < yliopistot2.size(); i++) {
            String h = yliopistot2.get(i);
            for (int j = 0; j < joukkueet.size(); j++) {
                if (joukkueet.get(j).length() >= h.length()) {
                    if ((joukkueet.get(j).substring(0, h.length()).equals(h))&& count<12) {
                        System.out.println(joukkueet.get(j));
                        count++;
                        break;
                    }

                }

            }


        }


    }
}

