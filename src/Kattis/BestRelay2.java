package Done;

import java.util.*;

public class BestRelay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        ArrayList<Double> alotukset = new ArrayList<>();
        ArrayList<Double> lopeutk = new ArrayList<>();
        ArrayList<String> juoksijat = new ArrayList<>();
        Map<String, Double> lopetuksett = new HashMap<>();
        Map<String, Double> aloitukset = new HashMap<>();


        for (int i = 0; i < x; i++) {
            String y = sc.nextLine();

            juoksijat.add(y);
            String[] j = y.split(" ");
            String name = j[0];


            double aloitus = Double.parseDouble(j[1]);
            double lopetus = Double.parseDouble(j[2]);
            aloitukset.put(name, aloitus);
            lopetuksett.put(name, lopetus);
            alotukset.add(aloitus);
            lopeutk.add(lopetus);


        }

        Collections.sort(alotukset);
        Collections.sort(lopeutk);

        ArrayList<String> aloitusJuoksijat = new ArrayList<>();
        ArrayList<String> lopeutusjuoksijat = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            double du = alotukset.get(i);
            for (String aJuoksijat : juoksijat) {
                String[] g = aJuoksijat.split(" ");
                double aika = Double.parseDouble(g[1]);
                if (du == aika)
                    aloitusJuoksijat.add(aJuoksijat);

            }

        }
        for (int i = 0; i < 4; i++) {
            double h = lopeutk.get(i);
            for (int j = 0; j < juoksijat.size(); j++) {
                String[] g2 = juoksijat.get(j).split(" ");
                double aika2 = Double.parseDouble(g2[2]);
                if (aika2 == h) {
                    lopeutusjuoksijat.add(juoksijat.get(j));
                    juoksijat.remove(juoksijat.get(j));
                }


            }
        }

//            System.out.println(aloitusJuoksijat);
//            System.out.println(lopeutusjuoksijat);
            ArrayList<Double> ajat =new ArrayList<>();
            Map<String[],Double>tiiimit=new HashMap<>();


        for (int i = 0; i <aloitusJuoksijat.size() ; i++) {
            String[]tiimi=new String[4];
            double sum =0;
            String hh = aloitusJuoksijat.get(i);
            String[]ooo=hh.split(" ");

            tiimi[0]=ooo[0];
            double aika =Double.parseDouble(ooo[1]);
            sum+=aika;
            int t=3;
            int s=0;
            for (int j = 0; j<t ; j++) {
                if(lopeutusjuoksijat.get(j).equals(hh)){
                    t++;
                    continue;


                } else {
                    String[]pdl=lopeutusjuoksijat.get(j).split(" ");
                    sum+=Double.parseDouble(pdl[2]);

                    tiimi[1+s]=pdl[0];
                    s++;

                }

            }
           ajat.add(sum);
            tiiimit.put(tiimi, sum);

        }
        Collections.sort(ajat);
        double paras = ajat.get(0);


        for (Map.Entry<String[], Double> entry : tiiimit.entrySet()) {
            String[] key = entry.getKey();
            double val = entry.getValue();
            if (val == paras) {
                System.out.println(val);

                for (String h : key
                        ) {
                    System.out.println(h);

                }
                break;
            }
        }
        }
    }
