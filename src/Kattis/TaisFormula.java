package Done_not_in_git;

import java.util.ArrayList;
import java.util.Scanner;

public class TaisFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        ArrayList<String>lubut= new ArrayList<>(a);
        double sum =0;
        String[] x;
        String[] y;


        for (int i = 0; i <a ; i++) {
            lubut.add(sc.nextLine());

        }

        for (int i = 0; i <a-1 ; i++) {
            x=lubut.get(i).split(" ");
            y=lubut.get(i+1).split(" ");

            double eka = Double.parseDouble(x[0]);
            double toka = Double.parseDouble(x[1]);

            double kolmas = Double.parseDouble(y[0]);
            double neljäs = Double.parseDouble(y[1]);


            sum = sum + (toka+neljäs)/2.0*(kolmas-eka);


        }
        System.out.println(sum/1000.0);

    }
}
