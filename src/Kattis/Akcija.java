package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alennus = 0;
        int summa = 0;

        int x = sc.nextInt();

        ArrayList<Integer> prices = new ArrayList<Integer>();


        for (int i = 0; i < x; i++) {
            int luku = sc.nextInt();
            prices.add(luku);

        }



        Collections.sort(prices ,Collections.reverseOrder());

        for (int price:prices
                ) {
            summa+=price;

        }

        for (int i = 2; i < prices.size(); i += 3) {

            alennus += prices.get(i);

        }

        System.out.println(summa-alennus);
    }
}


