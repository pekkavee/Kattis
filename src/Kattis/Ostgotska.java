package Kattis.Solved;

import java.util.Scanner;

public class Ostgotska {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String x =sc.nextLine();
        String[]sanat=x.split(" ");
        int maara =0;
        int ae=0;


        for (int i = 0; i <sanat.length ; i++) {
            String u = sanat[i];

                maara++;

            if (u.contains("ae"))
                    ae++;


        }

        double prosentti=(double)ae/maara;
        if(prosentti>=0.4){
            System.out.println("dae ae ju traeligt va");
        } else {
            System.out.println("haer talar vi rikssvenska");
        }



        }



    }

