package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();


        while (in.hasNextLine()) {


            String x = in.nextLine();

            if (x.isEmpty()) {
                break;
            }
            lista.add(x);

        }

        int ca =1;

        for (String list :lista) {
            String[] strArray = list.split(" ");
            int[] intArray = new int[strArray.length];
            ArrayList<Integer> intAra = new ArrayList<>();
            for(int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
                intAra.add(Integer.parseInt(strArray[i]));
            }
            intAra.remove(0);
            Collections.sort(intAra);

            int min = intAra.get(0);
            int max = intAra.get(intAra.size()-1);
            System.out.println("Case " +ca+": "  + min+" " +max+" " +(max-min));
            ca++;
        }
        System.out.println();


    }
}




