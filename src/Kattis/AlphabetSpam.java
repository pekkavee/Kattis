package Done;

import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String x = in.next();



        double w = 0;
        double lc = 0;
        double uc = 0;
        double symb = 0;
        double lenght = x.length();

        for (int i = 0; i <x.length() ; i++) {
            char z = x.charAt(i);
            if (z=='_') {
                w++;
            } else if (Character.isUpperCase(z)) {
                uc++;
            } else if (Character.isLowerCase(z)) {
                lc++;
            } else {
                symb++;
            }

        }
        System.out.println(w/lenght);
        System.out.println(lc/lenght);
        System.out.println(uc/lenght);
        System.out.println(symb/lenght);







    }
}


