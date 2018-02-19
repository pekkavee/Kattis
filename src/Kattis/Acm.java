package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Acm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> kokeet = new ArrayList<>();
        ArrayList<String> kaikkikokeet = new ArrayList<>();

        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            if (x.equals("-1")) {
                break;
            }
            else {
                kaikkikokeet.add(x);

                if (x.contains("right")) {
                    String[] koe = x.split(" ");
                    kokeet.add(koe[1]);

                }


            }

        }


        int kokoAika = 0;

        for (int i = 0; i < kokeet.size(); i++) {

            String k = kokeet.get(i);

            ArrayList<Integer>tulokset = new ArrayList<>();
            for (int j = 0; j <kaikkikokeet.size() ; j++) {
                int tulos=0;
                String [] sdd = kaikkikokeet.get(j).split(" ");
                if((sdd[1].equals(k)) && (sdd[2].equals("wrong"))) {
                   tulos+=20;
                    }else if ((sdd[1].equals(k)) && (sdd[2].equals("right"))) {
                    int p= Integer.parseInt(sdd[0]);
                    tulos+=p;
                }
                kokoAika+=tulos;

                }


            }
        System.out.println(kokeet.size()+" "+kokoAika);

    }
    }
