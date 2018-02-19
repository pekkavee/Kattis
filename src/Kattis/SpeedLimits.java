package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class SpeedLimits {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> s = new ArrayList<>();
            ArrayList<Integer> matka = new ArrayList<>();


            while (sc.hasNext()) {
                int x = sc.nextInt();
                if (x == -1) {
                    break;
                } else {
                    ArrayList<Integer> hours = new ArrayList<>();
                    s.add(x);
                    for (int i = 0; i < x; i++) {
                        if (i == 0) {
                            int speed = sc.nextInt();
                            int hour = sc.nextInt();
                            int matk = speed * hour;
                            hours.add(hour);
                            matka.add(matk);
                        } else {
                            int speed = sc.nextInt();
                            int hour = sc.nextInt();
                            hours.add(hour);
                            hour = hour - hours.get(i - 1);
                            int matk = speed * hour;

                            matka.add(matk);

                        }

                    }

                }


            }

            int indeksi = 0;
            for (int i = 0; i <s.size() ; i++) {
                int tulos =0;
                for (int j = 0; j <s.get(i) ; j++) {
                    tulos+=matka.get(indeksi);
                    indeksi++;

                }
                System.out.println(tulos +" miles");

            }

        }

    }

