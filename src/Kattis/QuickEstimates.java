package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickEstimates {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        ArrayList<String> costs = new ArrayList<>();

        for (int i = 0; i <x ; i++) {
           costs.add(sc.next());

        }
        sc.close();

        for (String cost: costs) {
            System.out.println(cost.length());

        };

    }
}
