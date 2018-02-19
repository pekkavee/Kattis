package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Patuljci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        ArrayList<Integer> numerot = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int x = Integer.parseInt(sc.nextLine());
            numerot.add(x);
        }
        sc.close();
        ArrayList<Integer> numerot2 = new ArrayList<>();
        for (int i = 0; i < numerot.size(); i++) {
            numerot2.add(numerot.get(i));

        }


        while (true) {
            Collections.shuffle(numerot);
            sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += numerot.get(i);

            }
            if (sum == 100) {

                numerot.remove(numerot.size() - 1);
                numerot.remove(numerot.size()-1);

                for (int i = 0; i < numerot2.size(); i++) {
                    if (numerot.contains(numerot2.get(i))) {
                        System.out.println(numerot2.get(i));
                    }

                }


                break;

            }


        }
    }
}


