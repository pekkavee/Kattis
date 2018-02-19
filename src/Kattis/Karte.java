package Done;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Karte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        ArrayList<String>karte=new ArrayList<>();

        int p =0;
        int k = 0;
        int h=0;
        int t=0;

        for (int i = 0; i <x.length() ; i+=3) {
            String d = x.substring(i,i+3);
            karte.add(d);

        }


        Set<String> set = new HashSet<String>(karte);
        if (set.size()<karte.size()){
            System.out.println("GRESKA");
        } else {
            for (int i = 0; i <karte.size() ; i++) {
                String f =karte.get(i);
                if(f.charAt(0)=='T') {
                    t++;
                } else if (f.charAt(0)=='P'){
                    p++;
                } else if (f.charAt(0)=='K'){
                    k++;
                } else if (f.charAt(0)=='H') {
                    h++;
                }

            }
            System.out.println((13-p)+" "+(13-k)+" "+(13-h)+" "+(13-t));
        }

    }
}
