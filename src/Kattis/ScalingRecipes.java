package Done;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ScalingRecipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loops = Integer.parseInt(sc.nextLine());

        for (int n = 0; n < loops; n++) {


            String x = sc.nextLine();
            String[] xx = x.split(" ");
            int aineet = Integer.parseInt(xx[0]);
            int reseptiMaara = Integer.parseInt(xx[1]);
            int haluttuMaara = Integer.parseInt(xx[2]);
            ArrayList<String> ainekset = new ArrayList<>();
            for (int i = 0; i < aineet; i++) {
                ainekset.add(sc.nextLine());

            }

            String paaAines = null;
            String paaA = null  ;
            String paaP=null;
            for (String a : ainekset
                    ) {
                String[]aa=a.split(" ");
                if (aa[2].equals("100.0")) {
                    String[] hh = a.split(" ");
                    paaAines = hh[0];
                    paaA = hh[1];




                }


            }


            System.out.println("Recipe # " + (n + 1));
            for (int i = 0; i < ainekset.size(); i++) {
                String o = ainekset.get(i);
                String[] oo = o.split(" ");
                System.out.print(oo[0] + " ");
                float maara = Float.parseFloat(oo[1]);
                float prosentti = Float.parseFloat(oo[2]);
                DecimalFormat df = new DecimalFormat("#.#");
                Double pp=Double.parseDouble(paaA);

                System.out.print(df.format(pp*haluttuMaara/reseptiMaara * prosentti / 100) + " \n");


            }
            System.out.println("----------------------------------------");



        }
    }
}
