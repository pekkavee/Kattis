package Done;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Double> sykkeet = new ArrayList<>();
        ArrayList<Double> ajat = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.####");



        for (int i = 0; i <x ; i++) {
            double beats = sc.nextDouble();
            double time = sc.nextDouble();
            sykkeet.add(beats);
            ajat.add(time);

        }
        for (int i = 0; i <x ; i++) {
            double minAbpm=(double)60*(sykkeet.get(i)-1)/ajat.get(i);
            double BPM=(double)60*sykkeet.get(i)/ajat.get(i);
            double maxAbpm=(double)60*(sykkeet.get(i)+1)/ajat.get(i);

            System.out.print(df.format(minAbpm) +" "+df.format(BPM)+" "+df.format(maxAbpm));
            System.out.println("");


        }

    }
}
