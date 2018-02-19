package Done;

import java.util.*;

public class Darts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tavoite= Integer.parseInt(sc.nextLine());
        ArrayList<Integer> mahdolliset = new ArrayList<>();
        Map<Integer, String>mahollisuudet=new HashMap<>();
        
        for (int i = 1; i <= 20; i++) {
            mahdolliset.add(i);
            mahollisuudet.put(i, ("Single "+i));
            mahdolliset.add(i+i);
            mahollisuudet.put((i+i),("Double " +i));
            mahdolliset.add(i+i+i);
            mahollisuudet.put((i+i+i),("Triple "+i));
        }
        Set<Integer> n=new HashSet<Integer>(mahdolliset);
        mahdolliset.clear();
        mahdolliset.addAll(n);
        Collections.sort(mahdolliset);

        String ip="no";

        
        if(mahdolliset.contains(tavoite)){

            System.out.println(mahollisuudet.get(tavoite));
            ip="yes";
        }
        if(ip.equals("no")) {
            outer:
            for (int i = 0; i < mahdolliset.size(); i++) {
                int l = mahdolliset.get(i);
                for (int j = 0; j < mahdolliset.size(); j++) {
                    int h = mahdolliset.get(j);
                    if (l + h == tavoite) {

                        System.out.println(mahollisuudet.get(l) + "\n" + mahollisuudet.get(h));
                        ip = "yes";
                        break outer;
                    }

                }

            }
        }
        if(ip.equals("no")){
        ulompi:
        for (int i = 0; i <mahdolliset.size() ; i++) {
            int eka = mahdolliset.get(i);
            for (int j = 0; j < mahdolliset.size(); j++) {
                int toka = mahdolliset.get(j);
                for (int k = 0; k < mahdolliset.size(); k++) {
                    int kolmas = mahdolliset.get(k);
                    if (eka + toka + kolmas == tavoite) {

                        System.out.println(mahollisuudet.get(eka) + "\n" + mahollisuudet.get(toka) + "\n" + mahollisuudet.get(kolmas));
                        ip="yes";
                        break ulompi;
                    }

                }

            }
        }

        }
        if(ip.equals("no"))
        System.out.println("impossible");
    }
}
