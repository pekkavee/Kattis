package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine().toLowerCase();
        sc.close();
        int t = 0, g = 0, c = 0;

        for (int i = 0; i <x.length() ; i++) {
            if(x.charAt(i)=='t'){
                t++;
            } else if (x.charAt(i)=='g') {
                g++;
            } else if (x.charAt(i)=='c') {
                c++;
            }
        }

        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(t);
        luvut.add(g);
        luvut.add(c);

        Collections.sort(luvut);


        System.out.println(t*t + g*g +c*c+(luvut.get(0)*7));
    }
}
