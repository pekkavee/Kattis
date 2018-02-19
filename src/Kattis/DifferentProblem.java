package Done;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class DifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigInteger> tulokset = new ArrayList<>();


        while(sc.hasNextLine()) {
            String x = sc.nextLine();
            if (!x.isEmpty()) {
                String[] unsorted = x.split(" "); //array of Strings
                BigInteger[] series = new BigInteger[2];
                BigInteger eka = new BigInteger(unsorted[0]);
                BigInteger toka = new BigInteger(unsorted[1]);
                BigInteger vastaus = eka.subtract(toka);
                tulokset.add(vastaus);

            } else {
                break;
            }
        }
        for (BigInteger b: tulokset
             ) {
            System.out.println(b.abs());

        }
    }
}
