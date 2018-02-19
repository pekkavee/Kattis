package Done;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ParadoxWithAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        for (int p = 0; p < x; p++) {
            ArrayList<Integer> computer = new ArrayList<>();
            ArrayList<Integer> econimcs = new ArrayList<>();

            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < a; i++) {
                computer.add(sc.nextInt());

            }
            for (int i = 0; i < b; i++) {
                econimcs.add(sc.nextInt());

            }

            int cSum = 0;
            for (int i = 0; i < computer.size(); i++) {
                cSum += computer.get(i);

            }
            int eSum = 0;
            for (int i = 0; i < econimcs.size(); i++) {
                eSum += econimcs.get(i);

            }
            double cAve = (double) cSum / (double) computer.size();
            double eAve = (double) eSum / (double) econimcs.size();

            int h = 0;
            for (int i = 0; i < computer.size(); i++) {
                if (computer.get(i) > eAve && computer.get(i) < cAve) {
                    h++;
                }

            }
            System.out.println(h);
            h=0;

        }
    }
}
