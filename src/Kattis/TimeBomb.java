package Kattis.Solved;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeBomb {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<StringBuilder>luvut =new ArrayList<>(10);
        ArrayList<String>rivit =new ArrayList<>();

        rivit.add("***   * *** *** * * *** *** *** *** ***");
        rivit.add("* *   *   *   * * * *   *     * * * * *");
        rivit.add("* *   * *** *** *** *** ***   * *** ***");
        rivit.add("* *   * *     *   *   * * *   * * *   *");
        rivit.add("***   * *** ***   * *** ***   * *** ***");

        for (int i = 0; i <10; i++) {
            StringBuilder sb =new StringBuilder("");
            luvut.add(sb);

        }

        for (int i = 0; i <rivit.size() ; i++) {
            String x =rivit.get(i);

            for (int j = 0, l=0; j <10 ; j++) {
                luvut.get(j).append(x.substring(l, l+3)+"\n");
                l+=4;

            }


        }





        ArrayList<String>luku =new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            luku.add(sc.nextLine());

        }
        ArrayList<StringBuilder>bom=new ArrayList<>();

        for (int i = 0, k=0; k <luku.get(0).length() ; i++) {
            StringBuilder s =new StringBuilder("");
            s.append(luku.get(0).substring(k, k+3)+"\n");
            s.append(luku.get(1).substring(k,k+3)+"\n");
            s.append(luku.get(2).substring(k,k+3)+"\n");
            s.append(luku.get(3).substring(k,k+3)+"\n");
            s.append(luku.get(4).substring(k,k+3)+"\n");
            bom.add(s);
            k+=4;



        }



    StringBuilder l =new StringBuilder();

        for (int i = 0; i <bom.size() ; i++) {
            String d = String.valueOf(bom.get(i));
            for (int j = 0; j <luvut.size() ; j++) {
                String f =String.valueOf(luvut.get(j));
                if(d.equals(f)){
                    l.append(j);
                }

            }

        }

        int g =Integer.parseInt(l.toString());
        if(g%6==0){
            System.out.println("BEER!!");
        }else{
            System.out.println("BOOM!!");
        }







    }
}
