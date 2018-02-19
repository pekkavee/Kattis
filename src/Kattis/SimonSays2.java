package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class SimonSays2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int x = Integer.parseInt(in.nextLine());
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < x ; i++) {
            String y = in.nextLine();
            lista.add(y);

        }
        in.close();

        for (int i = 0; i < lista.size() ; i++) {
            String y = lista.get(i);

            if (y.length()>10 && y.substring(0,10).equals("Simon says")) {
                System.out.println(y.substring(11));
            } else {
               continue;
            }

        }


    }
}
