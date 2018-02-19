package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class OddGnome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer[]>joukuot=new ArrayList<>();
        for (int i = 0; i <x ; i++) {
            int y = sc.nextInt();
            Integer[]luvut=new Integer[y];
            for (int j = 0; j <y ; j++) {
                int u = sc.nextInt();
                luvut[j]=u;
            }
            joukuot.add(luvut);

        }

        for (int i = 0; i <joukuot.size() ; i++) {

            Integer[]k=joukuot.get(i);
            int o = k[0];
            for (int j = 0; j <k.length ; j++) {
                if(k[j]!=o) {

                    System.out.println(j+1);
                }
                else
                o++;

            }

            }

        }

    }

