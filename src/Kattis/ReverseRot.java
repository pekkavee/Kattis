package Done;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseRot {
    public static void main(String[] args) {


        List<String> ascii = new ArrayList<String>(26);

        for (char c = 'A'; c <= 'Z'; c++)
            ascii.add(String.valueOf(c));
        ascii.add("_");
        ascii.add(".");


        Scanner sc = new Scanner(System.in);

        while (true) {
            String x = sc.nextLine();
            if(x.equals("0")){
                break;
            }
            String[] xx = x.split(" ");


            int rounds = Integer.parseInt(xx[0]);
            String sana = xx[1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sana.length(); i++) {

                String e = String.valueOf(sana.charAt(i));
                int index = ascii.indexOf(e);
                String uusi = "";
                if (index + rounds < ascii.size()) {
                    sb.append(ascii.get(index + rounds));

                } else {
                    sb.append(ascii.get(index + rounds - ascii.size()));
                }

            }
            System.out.println(sb.reverse());


        }
    }
}