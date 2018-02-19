package Done;

import java.util.*;

public class DrmMessage {
    static List<String> ascii = new ArrayList<String>(26);

    public static void main(String[] args) {

        for (char c = 'A'; c <= 'Z'; c++) {
            ascii.add(String.valueOf(c));

        }
        Scanner sc =new Scanner(System.in);
        String g =sc.nextLine();
        sc.close();
        sekoita(g);
    }

    public static void sekoita(String sana) {
        String eka = sana.substring(0, sana.length() / 2);
        String toka = sana.substring(sana.length() / 2);
        int ekaSum = 0;
        int tokaSum = 0;
        String ekaUusi = "";
        String tokaUusi = "";
        for (int i = 0; i < eka.length(); i++) {
            String a = String.valueOf(eka.charAt(i));
            ekaSum += ascii.indexOf(a);
        }
        for (int i = 0; i < toka.length(); i++) {
            String b = String.valueOf(toka.charAt(i));
            tokaSum += ascii.indexOf(b);
        }
        for (int i = 0; i < eka.length(); i++) {
            int ind = ascii.indexOf(String.valueOf(eka.charAt(i)));
            int uusi = ekaSum % ascii.size();
            int o =uusi+ind;

            if (ind + uusi < ascii.size()) {
                ekaUusi = ekaUusi.concat(ascii.get(ind + uusi));
            } else {
                ekaUusi = ekaUusi.concat(ascii.get(o - ascii.size()));
            }
        }
        for (int i = 0; i < toka.length(); i++) {
            int ind = ascii.indexOf(String.valueOf(toka.charAt(i)));
            int uusi = tokaSum % ascii.size();
            int o =uusi+ind;

            if (ind + uusi < ascii.size()) {
                tokaUusi = tokaUusi.concat(ascii.get(ind + uusi));
            } else {
                tokaUusi = tokaUusi.concat(ascii.get(o - ascii.size()));
            }
        }

        String vika ="";
        for (int i = 0; i <eka.length() ; i++) {
            int ind = ascii.indexOf(String.valueOf(ekaUusi.charAt(i)));
            int toinen=ascii.indexOf(String.valueOf(tokaUusi.charAt(i)));
            if(ind+toinen<ascii.size()){
                vika=vika.concat(ascii.get(ind+toinen));

            }else {
                vika=vika.concat(ascii.get(ind+toinen-ascii.size()));
            }


        }
        System.out.println(vika);
    }
}