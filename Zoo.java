package Kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int list =1;

        while (true){
            ArrayList<String>spiecies=new ArrayList<>();

            int x = Integer.parseInt(sc.nextLine());
            if (x==0)
                break;
            else{
                for (int i = 0; i <x ; i++) {
                    String a =sc.nextLine();
                    int c =a.lastIndexOf(" ");

                    if(c!=-1)
                    spiecies.add(a.substring(c+1).toLowerCase());
                    else
                        spiecies.add(a.toLowerCase());


                }
            }

            Collections.sort(spiecies);
            System.out.println("List "+list+":");

            list++;

            for (int j = 0; j <spiecies.size() ; ) {
            String s =spiecies.get(0);
            int lkm=0;
                for (String a:spiecies
                     ) { if(a.equals(s)){
                         lkm++;

                }

                }
                System.out.println(s+" | "+lkm);
                for (int i = 0; i <spiecies.size() ; i++) {
                    if(spiecies.get(i).equals(s)){
                        spiecies.remove(i);
                        lkm++;
                        i--;
                    }

                }


            }

        }


    }
}
