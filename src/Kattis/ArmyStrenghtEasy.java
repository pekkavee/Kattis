package Kattis.Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArmyStrenghtEasy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int u = Integer.parseInt(sc.nextLine());
        sc.nextLine();

        for (int i = 0; i <u ; i++) {
            ArrayList<Integer>g=new ArrayList<>();
            ArrayList<Integer>mG=new ArrayList<>();
            int a =sc.nextInt();
            int b =sc.nextInt();
            for (int j = 0; j <a ; j++) {

                g.add(sc.nextInt());
            }
            for (int j = 0; j <b ; j++) {
                mG.add(sc.nextInt());
            }
            Collections.sort(g);
            Collections.sort(mG);
            sc.nextLine();

            int f =0;
            if (g.size()<mG.size()){
                f=mG.size();
            } else {
                f=g.size();
            }

            while (true) {
                if(g.size()<1 || mG.size()<1){
                    break;
                }
                if(g.get(0)>=mG.get(0)){
                    mG.remove(0);
                } else {
                    g.remove(0);
                }

            }
            if(g.size()>mG.size()){
                System.out.println("Godzilla");
            } else if (mG.size()>g.size()) {
                System.out.println("MechaGodzilla");
            }
            else {
                System.out.println("uncertain");
            }
        }


    }
}
